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
  public void calculateCost_Wedding100orUnder_1000(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    int expectedOutcome = 1000;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_WeddingOver100_1300(){
    Event eventCreated = new Event("Wedding",101,"Dinner","Band","Open Bar");
    int expectedOutcome = 1015;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
//Holiday
  @Test
  public void calculateCost_Holiday50orUnder_500(){
    Event eventCreated = new Event("Holiday",25,"Dinner","Band","Open Bar");
    int expectedOutcome = 500;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_HolidayOver50_515(){
    Event eventCreated = new Event("Holiday",51,"Dinner","Band","Open Bar");
    int expectedOutcome = 515;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
  //birthday
  @Test
  public void calculateCost_Birthday30orUnder_200(){
    Event eventCreated = new Event("Birthday",25,"Dinner","Band","Open Bar");
    int expectedOutcome = 200;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_BirthdayOver30_210(){
    Event eventCreated = new Event("Birthday",31,"Dinner","Band","Open Bar");
    int expectedOutcome = 210;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
  //Dinner

  //horderves

  //pizza 6 people for a large pizza $17




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
