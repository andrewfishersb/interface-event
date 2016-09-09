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
