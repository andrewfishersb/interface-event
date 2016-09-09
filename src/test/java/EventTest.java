import org.junit.*;
import static org.junit.Assert.*;

public class EventTest{

  @Test
  public void newEvent_EventExists_Event(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    assertEquals(true, eventCreated instanceof Event);
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
//meal
  @Test
  public void getMeal_TypeOfMeal_Dinner(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    String expectedOutcome = "Dinner";
    assertEquals(expectedOutcome, eventCreated.getMeal());
  }
//msuic
  @Test
  public void getMusic_MusicProvidedPlatform_Band(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    String expectedOutcome = "Band";
    assertEquals(expectedOutcome, eventCreated.getMusic());
  }
//drinlks
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
