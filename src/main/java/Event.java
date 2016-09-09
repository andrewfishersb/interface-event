import java.util.List;
import java.util.ArrayList;


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


  //create a seperate constructor to handle a randomization
  public Event(String partyType, int numberOfAttendees, String meal, String music, String drinks){
    mPartyType = partyType;
    mNumberOfAttendees = numberOfAttendees;
    mMeal = meal;
    mMusic = music;
    mDrinks = drinks;
    mTotalCost = 0;
  }

  // ave wedding cost in portland 6,000
  //control for random input
  public void calculateCost(){
    if(mPartyType.equalsIgnoreCase("Wedding")){
      mTotalCost += 1000;
      if(mNumberOfAttendees >100){
        mTotalCost += 15 * (mNumberOfAttendees-100);
      }
    }else if(mPartyType.equalsIgnoreCase("Holiday")){
        mTotalCost+=500;
      if(mNumberOfAttendees > 50){
          mTotalCost+= 15 * (mNumberOfAttendees-50);
      }
    }else{
      mTotalCost +=200;
      if(mNumberOfAttendees>30){
        mTotalCost+= 10 * (mNumberOfAttendees-30);
      }
    }

  }
 // possibly change grammar for certain outcomes like 1 person and not for 1 people
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
