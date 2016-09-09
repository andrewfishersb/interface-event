import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class EventTest{

  @Test
  public void newEvent_EventExists_Event(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    assertEquals(true, eventCreated instanceof Event);
  }


  @Test
  public void displayRequest_WritesAStringOfAllYourRequestedInformation_String(){
    Event eventCreated = new Event("Birthday",10,"Horderves","DJ","Cash Bar");
    eventCreated.calculateCost();
    String expectedOutcome = "\tAndrew's Event Planning\nBirthday \t $100\nGuest Count \t 10 \nHorderves \t $50 \nDJ\t \t $200 \nCash Bar \t $100\nTotal Amount: \t $450.";
    assertEquals(expectedOutcome, eventCreated.displayRequest());
  }

  @Test
  public void calculateCost_Wedding100orUnder_1610(){
    Event eventCreated = new Event("Wedding",100,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 1610;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_WeddingOver100_1630(){
    Event eventCreated = new Event("Wedding",101,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 1630;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_Holiday50orUnder_660(){
    Event eventCreated = new Event("Holiday",50,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 660;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_HolidayOver50_680(){
    Event eventCreated = new Event("Holiday",51,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 680;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_Birthday30orUnder_360(){
    Event eventCreated = new Event("Birthday",30,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 360;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_BirthdayOver30_375(){
    Event eventCreated = new Event("Birthday",31,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 375;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_DinnerAdded_460(){
    Event eventCreated = new Event("Birthday",10,"Dinner","Personal Playlist","Cash Bar");
    int expectedOutcome = 460;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_HordervesAdded_1160(){
    Event eventCreated = new Event("Wedding",10,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 1160;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_PizzaAdded_278(){
    Event eventCreated = new Event("Birthday",20,"Pizza","Personal Playlist","Cash Bar");
    int expectedOutcome = 278;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_BandAdded_750(){
    Event eventCreated = new Event("Birthday",10,"Horderves","Band","Cash Bar");
    int expectedOutcome = 750;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_DJAdded_450(){
    Event eventCreated = new Event("Birthday",10,"Horderves","DJ","Cash Bar");
    int expectedOutcome = 450;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
  @Test
  public void calculateCost_PlaylistAdded_460(){
    Event eventCreated = new Event("Holiday",10,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 460;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_OpenBarAdded_360(){
    Event eventCreated = new Event("Birthday",10,"Horderves","Personal Playlist","Open Bar");
    int expectedOutcome = 360;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_KegsAdded_2510(){
    Event eventCreated = new Event("Birthday",150,"Horderves","Personal Playlist","Kegs");
    int expectedOutcome = 2510;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }

  @Test
  public void calculateCost_CashBarAdded_260(){
    Event eventCreated = new Event("Birthday",10,"Horderves","Personal Playlist","Cash Bar");
    int expectedOutcome = 260;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
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
    public void getMusic_ControlForBadInput_NoMusic(){
      Event eventCreated = new Event("Birthday",10,"Horderves","Pop Star","Cash Bar");
      eventCreated.calculateCost();
      String expectedOutcome = "No Music";
      assertEquals(expectedOutcome, eventCreated.getMusic());
    }
  @Test
  public void getDrinks_DrinkService_OpenBar(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    String expectedOutcome = "Open Bar";
    assertEquals(expectedOutcome, eventCreated.getDrinks());
  }

  @Test
  public void getTotalCost_Cost_6000(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    int expectedOutcome = 6000;
    eventCreated.calculateCost();
    assertEquals(expectedOutcome, eventCreated.getTotalCost());
  }
  @Test
  public void getCostArrayList_CostArray_ArrayList(){
    Event eventCreated = new Event("Wedding",100,"Dinner","Band","Open Bar");
    eventCreated.calculateCost();
    List<Integer> expectedOutcome = new ArrayList<Integer>();
    expectedOutcome.add(1000);
    expectedOutcome.add(2500);
    expectedOutcome.add(500);
    expectedOutcome.add(2000);
    assertEquals(expectedOutcome, eventCreated.getCostArrayList());
  }
}
