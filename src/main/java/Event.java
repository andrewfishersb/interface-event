public class Event{
  private int mNumberOfAttendees;
  private String mPartyType;
  private String mMeal;
  private String mMusic;
  private String mDrinks;
  private int mTotalCost;

  public Event(String partyType, int numberOfAttendees, String meal, String music, String drinks){
    mPartyType = partyType;
    mNumberOfAttendees = numberOfAttendees;
    mMeal = meal;
    mMusic = music;
    mDrinks = drinks;
    mTotalCost = 0;
  }
  public void calculateCost(){

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
