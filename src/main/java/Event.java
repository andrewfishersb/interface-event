import java.util.List;
import java.util.ArrayList;
import java.lang.Throwable;
import java.util.Random;

public class Event{

  private int mNumberOfAttendees;
  private String mPartyType;
  private String mMeal;
  private String mMusic;
  private String mDrinks;
  private int mTotalCost;
  private ArrayList<Integer> mCosts;

  public Event(String partyType, int numberOfAttendees, String meal, String music, String drinks){
    mPartyType = partyType;
    mNumberOfAttendees = numberOfAttendees;
    mMeal = meal;
    mMusic = music;
    mDrinks = drinks;
    mTotalCost = 0;
    mCosts = new ArrayList<Integer>();
  }

  public Event(){
    Random rnd = new Random();
    String [] partyOptions = new String[]{"Wedding","Birthday","Holiday"};
    String [] mealOptions = new String[]{"Dinner","Horderves","Pizza"};
    String [] musicOptions = new String[]{"Band","DJ","Personal Playlist"};
    String [] drinkOptions = new String[]{"Open Bar","Cash Bar","Kegs"};
    mPartyType = partyOptions [rnd.nextInt(3)];
    mMeal = mealOptions [rnd.nextInt(3)];
    mMusic = musicOptions [rnd.nextInt(3)];
    mDrinks = drinkOptions [rnd.nextInt(3)];
    mNumberOfAttendees = rnd.nextInt(200)+1;
    mCosts = new ArrayList<Integer>();
  }


  public void calculateCost(){
    if(mPartyType.equalsIgnoreCase("Wedding")){
      mTotalCost += 1000;
      if(mNumberOfAttendees >100){
        mTotalCost += 15 * (mNumberOfAttendees-100);
      }
    }else if(mPartyType.equalsIgnoreCase("Holiday")){
        mTotalCost+=300;
      if(mNumberOfAttendees > 50){
          mTotalCost+= 15 * (mNumberOfAttendees-50);
      }
    }else{
      mTotalCost +=100;
      if(mNumberOfAttendees>30){
        mTotalCost+= 10 * (mNumberOfAttendees-30);
      }
    }
    mCosts.add(mTotalCost);
    if(mMeal.equalsIgnoreCase("Dinner")){
      mTotalCost += 25 * mNumberOfAttendees;
    }else if(mMeal.equalsIgnoreCase("Pizza")){
      mTotalCost += 17 * ((mNumberOfAttendees/6)+1);
    }else if(mMeal.equalsIgnoreCase("Horderves")){
      mTotalCost +=5 * mNumberOfAttendees;
    }else{
      mMeal = "No Food";
    }
    mCosts.add(mTotalCost-mCosts.get(mCosts.size()-1));

    if(mMusic.equalsIgnoreCase("Band")){
      mTotalCost += 500;
    }else if(mMusic.equalsIgnoreCase("DJ")){
      mTotalCost += 200;
    }else if(mMusic.equalsIgnoreCase("Personal Playlist")||mMusic.equalsIgnoreCase("Playlist")){
      mTotalCost += 10;
    }else{
      mMusic = "No Music";
    }
    mCosts.add(mTotalCost-(mCosts.get(mCosts.size()-1)+mCosts.get(mCosts.size()-2)));
    if(mDrinks.equalsIgnoreCase("Open Bar")||mDrinks.equalsIgnoreCase("Open")){
      mTotalCost += 20 * mNumberOfAttendees;
    }else if(mDrinks.equalsIgnoreCase("Keg") || mDrinks.equalsIgnoreCase("Kegs")){
      double roundUp = Math.ceil((double)mNumberOfAttendees/50);

      if(mNumberOfAttendees < 15){
        mTotalCost +=60;
      }
      else if(mNumberOfAttendees< 30){
        mTotalCost += 80;
      }else{
        mTotalCost +=  roundUp * 150;
      }
    }else if(mDrinks.equalsIgnoreCase("Cash Bar")||mDrinks.equalsIgnoreCase("Cash")||mDrinks.equalsIgnoreCase("Bar")){
      mTotalCost += 100;
    }else{
      mDrinks = "No Alcohol";
    }
    mCosts.add(mTotalCost-(mCosts.get(mCosts.size()-1)+mCosts.get(mCosts.size()-2)+mCosts.get(mCosts.size()-3)));
  }

  public String displayRequest(){
    if(mMusic.equalsIgnoreCase("Personal Playlist")){
      mMusic = "Stereo Rental";
    }
    if(mMeal.equalsIgnoreCase("pizza")||mMeal.equalsIgnoreCase("dinner")){
      mMeal +="\t";
    }
    if(mMusic.equalsIgnoreCase("DJ")|| mMusic.equalsIgnoreCase("band")){
      mMusic +="\t";
    }
    if(mDrinks.equalsIgnoreCase("Keg")||mDrinks.equalsIgnoreCase("Kegs")){
      mDrinks ="Keg(s)\t";
    }

    String receipt = String.format("\tAndrew's Event Planning\n%s \t $%d\nGuest Count \t %d \n%s \t $%d \n%s \t $%d \n%s \t $%d\nTotal Amount: \t $%d.",mPartyType,mCosts.get(0),mNumberOfAttendees,mMeal,mCosts.get(1),mMusic,mCosts.get(2),mDrinks,mCosts.get(3),mTotalCost);

    return receipt;
  }


  public String getPartyType(){
    return mPartyType;
  }

  public String getMeal(){
    return mMeal;
  }

  public String getMusic(){
    return mMusic;
  }

  public String getDrinks(){
    return mDrinks;
  }

  public int getNumberOfAttendees(){
    return mNumberOfAttendees;
  }


  public int getTotalCost(){
    return mTotalCost;
  }
  public ArrayList<Integer> getCostArrayList(){
    return mCosts;
  }
}
