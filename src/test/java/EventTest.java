import org.junit.*;
import static org.junit.Assert.*;

public class EventTest{

  @Test
  public void newEvent_EventExists_Event(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    assertEquals(true, eventCreated instanceof Event);
  }

  @Test
  public void displayRequest_WritesAStringOfAllYourRequestedInformation_String(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    String expectedOutcome = "You have requested a Wedding for 100 people. You will be served Dinner, alongside an Open Bar. Your musical entertainment will be provided by a Band";
    assertEquals(expectedOutcome, eventCreated.displayRequest());
  }
//wedding
  @Test
  public void calculateCost_Wedding100orUnder_1610(){
    Event eventCreated = new Event("Wedding",100,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 1810;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_WeddingOver100_1630(){
    Event eventCreated = new Event("Wedding",101,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 1830;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
//Holiday
  @Test
  public void calculateCost_Holiday50orUnder_500(){
    Event eventCreated = new Event("Holiday",50,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 500;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_HolidayOver50_1790(){
    Event eventCreated = new Event("Holiday",51,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 515;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
  //birthday
  @Test
  public void calculateCost_Birthday30orUnder_325(){
    Event eventCreated = new Event("Birthday",30,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 325;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_BirthdayOver30_365(){
    Event eventCreated = new Event("Birthday",31,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 365;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
  //MEALS TESTING
  //Dinner
  @Test
  public void calculateCost_DinnerAdded_825(){
    Event eventCreated = new Event("Birthday",10,"Dinner","Personal Playlist","Cash Bar");
    int expectedOutcome = 825;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
  //horderves
  @Test
  public void calculateCost_HordervesAdded_325(){
    Event eventCreated = new Event("Birthday",10,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 325;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
  //pizza 6 people for a large pizza $17
  @Test
  public void calculateCost_PizzaAdded_455(){
    Event eventCreated = new Event("Birthday",10,"Pizza","Personal Playlist","Cash Bar");
    int expectedOutcome = 455;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
//TESTING MUSIC
//Band
  @Test
  public void calculateCost_BandAdded_455(){
    Event eventCreated = new Event("Birthday",10,"Horderves","Band","Cash Bar");
    int expectedOutcome = 455;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
  //DJ
  @Test
  public void calculateCost_DJAdded_455(){
    Event eventCreated = new Event("Birthday",10,"Horderves","DJ","Cash Bar");
    int expectedOutcome = 455;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
  //Playlist
  @Test
  public void calculateCost_PlaylistAdded_455(){
    Event eventCreated = new Event("Birthday",10,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 455;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
//TESTING Drink provider
//Open Bar
  @Test
  public void calculateCost_OpenBarAdded_455(){
    Event eventCreated = new Event("Birthday",10,"Horderves","Personal Playlist","Open Bar");
    int expectedOutcome = 455;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
  //Keg - may depend on amount of people
  @Test
  public void calculateCost_KegsAdded_455(){
    Event eventCreated = new Event("Birthday",10,"Horderves","Personal Playlist","Kegs");
    int expectedOutcome = 455;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
  //Cash Bar
  @Test
  public void calculateCost_CashBarAdded_455(){
    Event eventCreated = new Event("Birthday",10,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 455;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
//Getters
  @Test
  public void getPartyType_TypeOfParty_Wedding(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    String expectedOutcome = "Wedding";
    assertEquals(expectedOutcome, eventCreated.getPartyType());
  }
  @Test
  public void getNumberOfAttendees_NumberOfAttendees_100(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    int expectedOutcome = 100;
    assertEquals(expectedOutcome, eventCreated.getNumberOfAttendees());
  }

  @Test
  public void getMeal_TypeOfMeal_Dinner(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    String expectedOutcome = "Dinner";
    assertEquals(expectedOutcome, eventCreated.getMeal());
  }

  @Test
  public void getMusic_MusicProvidedPlatform_Band(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    String expectedOutcome = "Band";
    assertEquals(expectedOutcome, eventCreated.getMusic());
  }

  @Test
  public void getDrinks_DrinkService_OpenBar(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    String expectedOutcome = "Open Bar";
    assertEquals(expectedOutcome, eventCreated.getDrinks());
  }

  @Test
  public void getTotalCost_Cost_10000(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    int expectedOutcome = 10000;
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

}
