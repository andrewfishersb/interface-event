import java.util.List;
import java.util.ArrayList;
import java.lang.Throwable;
import java.lang.Exception;


public class Event{
  // private String [] partyOptions;
  // private String [] mealOptions;
  // private String [] musicOptions;
  // private String [] drinkOptions;
  private int mNumberOfAttendees;
  private String mPartyType;
  private String mMeal;
  private String mMusic;
  private String mDrinks;
  private int mTotalCost;
  //maybe make an array list to seperate the cost of all the items
  //maybe an array with all possible choices and have a validator method that quits if everything fails


  //create a seperate constructor to handle a randomization
  public Event(String partyType, int numberOfAttendees, String meal, String music, String drinks){
    mPartyType = partyType;
    mNumberOfAttendees = numberOfAttendees;
    mMeal = meal;
    mMusic = music;
    mDrinks = drinks;
    mTotalCost = 0;
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
    //meal
    if(mMeal.equalsIgnoreCase("Dinner")){
      mTotalCost += 25 * mNumberOfAttendees;
    }else if(mMeal.equalsIgnoreCase("Pizza")){
      mTotalCost += 17 * ((mNumberOfAttendees/6)+1);
    }else {
      mTotalCost +=5 * mNumberOfAttendees;
    }


    switch(mMusic){
      case "Band" :
      case "band" :
        mTotalCost += 500;
        break;
      case "DJ" :
      case "dj" :
        mTotalCost += 200;
        break;
      case "Personal Playlist" :
      case "personal playlist" :
        mTotalCost += 10;
        break;
      default : throw new IllegalArgumentException("Not a valid command");
    }
    //music
    // if(mMusic.equalsIgnoreCase("Band")){
    //   mTotalCost += 500;
    // }else if(mMusic.equalsIgnoreCase("DJ")){
    //   mTotalCost += 200;
    // }else{
    //   mTotalCost += 10;
    // }
    //drinks
    if(mDrinks.equalsIgnoreCase("Open Bar")){
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

  }
 // possibly change grammar for certain outcomes like 1 person and not for 1 people
 //rented speakers if type personal play list and i do the receipt
  public String displayRequest(){
    String writtenRequest = String.format("You have requested a %s for %d people. You will be served %s, alongside an %s. Your musical entertainment will be provided by a %s",mPartyType,mNumberOfAttendees,mMeal,mDrinks,mMusic);
    return writtenRequest;
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
