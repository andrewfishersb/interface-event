import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("What kind of party do you want to throw: Wedding, Holiday, Birthday, Randomize?");
    String type = myConsole.readLine();
    if(!type.equalsIgnoreCase("Wedding") && !type.equalsIgnoreCase("Holiday") &&!type.equalsIgnoreCase("Birthday")){
      Event randomParty = new Event();
      randomParty.calculateCost();
      String randomReceipt = randomParty.displayRequest();
      System.out.println(randomReceipt);
    }else{
      System.out.println("How many guests?");
      int guests = Integer.parseInt(myConsole.readLine());
      System.out.println("What Meal would you like to be served: Dinner, Horderves or Pizza?");
      String meal = myConsole.readLine();
      System.out.println("Which musical accompaniment would you prefer: Band, DJ, Personal Playlist");
      String music = myConsole.readLine();
      System.out.println("Which Alcohol service would you like: Open Bar, Cash Bar, Kegs");
      String bar = myConsole.readLine();
      Event party = new Event(type,guests,meal,music,bar);
      party.calculateCost();
      String receipt = party.displayRequest();
      System.out.println(receipt);
    }
  }
}
