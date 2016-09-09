import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    // System.out.println("What kind of party do you want to throw: Wedding, Holiday, or Birthday?");
    // String type = myConsole.readLine();
    // System.out.println("How many guests?");
    // int guests = Integer.parseInt(myConsole.readLine());
    // System.out.println("What Meal would you like to be served: Dinner, Horderves or Pizza?");
    // String meal = myConsole.readLine();
    // System.out.println("Which musical accompaniment would you prefer: Band, DJ, Personal Playlist");
    // String music = myConsole.readLine();
    // System.out.println("Which Alcohol service would you like: Open Bar, Cash Bar, Kegs");
    // String bar = myConsole.readLine();
    // Event party = new Event(type,guests,meal,music,bar);
    Event party = new Event();
    party.calculateCost();
    String receipt = party.displayRequest();
    System.out.println(receipt);
  }

}

  // System.exit(0);
