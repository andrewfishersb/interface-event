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
  private ArrayList<Integer> costs;
  //maybe make an array list to seperate the cost of all the items
  //maybe an array with all possible choices and have a validator method that quits if everything fails

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
    costs = new ArrayList<Integer>();
  }
  //create a seperate constructor to handle a randomization
  public Event(String partyType, int numberOfAttendees, String meal, String music, String drinks){
    mPartyType = partyType;
    mNumberOfAttendees = numberOfAttendees;
    mMeal = meal;
    mMusic = music;
    mDrinks = drinks;
    mTotalCost = 0;
    costs = new ArrayList<Integer>();
  }

  //control for random input
  public void calculateCost(){
    //party
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
    costs.add(mTotalCost);
    //meal
    if(mMeal.equalsIgnoreCase("Dinner")){
      mTotalCost += 25 * mNumberOfAttendees;
    }else if(mMeal.equalsIgnoreCase("Pizza")){
      mTotalCost += 17 * ((mNumberOfAttendees/6)+1);
    }else {
      mTotalCost +=5 * mNumberOfAttendees;
    }
    costs.add(mTotalCost-costs.get(costs.size()-1));

    if(mMusic.equalsIgnoreCase("Band")){
      mTotalCost += 500;
    }else if(mMusic.equalsIgnoreCase("DJ")){
      mTotalCost += 200;
    }else {
      mTotalCost += 10;
    }
    costs.add(mTotalCost-(costs.get(costs.size()-1)+costs.get(costs.size()-2)));
    //drinks
    if(mDrinks.equalsIgnoreCase("Open Bar")||mDrinks.equalsIgnoreCase("Open")){
      mTotalCost += 20 * mNumberOfAttendees;
    }else if(mDrinks.equalsIgnoreCase("Keg") || mDrinks.equalsIgnoreCase("Kegs")){
      double roundUp = Math.ceil((double)mNumberOfAttendees/50);

      // if(mNumberOfAttendees < 15){
      //   mTotalCost +=60;
      // }
      // else if(mNumberOfAttendees< 30){
      //   mTotalCost += 80;
      // }else{
        mTotalCost +=  roundUp * 150;//(mNumberOfAttendees/50)
      // }
    }else{
      mTotalCost += 100;
    }
    costs.add(mTotalCost-(costs.get(costs.size()-1)+costs.get(costs.size()-2)+costs.get(costs.size()-3)));
  }
 // possibly change grammar for certain outcomes like 1 person and not for 1 people
 //rented speakers if type personal play list and i do the receipt
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

    String receipt = String.format("\tAndrew's Event Planning\n%s \t $%d\nGuest Count \t %d \n%s \t $%d \n%s \t $%d \n%s \t $%d\nTotal Amount: \t $%d.",mPartyType,costs.get(0),mNumberOfAttendees,mMeal,costs.get(1),mMusic,costs.get(2),mDrinks,costs.get(3),mTotalCost);

    return receipt;
  }
//get rid of this method
  public boolean validate(){
return false;
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

}
