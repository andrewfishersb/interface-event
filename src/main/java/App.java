import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";
    get("/", (request,response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template","templates/form.vtl");
      return new ModelAndView(model,layout);
    }, new VelocityTemplateEngine());

    get("/output",(request,response)-> {
      Event party = new Event(request.queryParams("party-type"),Integer.parseInt(request.queryParams("guests")),request.queryParams("meal"),request.queryParams("music"),request.queryParams("drinks"));
      party.calculateCost();
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("party-type", request.queryParams("party-type"));
      model.put("meal", request.queryParams("meal"));
      model.put("music", request.queryParams("music"));
      model.put("guests", request.queryParams("guests"));
      model.put("drinks", request.queryParams("drinks"));
      model.put("money", party.getTotalCost());
      model.put("template","templates/output.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());







    // Console myConsole = System.console();
    // System.out.println("What kind of party do you want to throw: Wedding, Holiday, Birthday, Randomize?");
    // String type = myConsole.readLine();
    // if(!type.equalsIgnoreCase("Wedding") && !type.equalsIgnoreCase("Holiday") &&!type.equalsIgnoreCase("Birthday")){
    //   Event randomParty = new Event();
    //   randomParty.calculateCost();
    //   String randomReceipt = randomParty.displayRequest();
    //   System.out.println(randomReceipt);
    // }else{
    //   System.out.println("How many guests?");
    //   int guests = Integer.parseInt(myConsole.readLine());
    //   System.out.println("What Meal would you like to be served: Dinner, Horderves or Pizza?");
    //   String meal = myConsole.readLine();
    //   System.out.println("Which musical accompaniment would you prefer: Band, DJ, Personal Playlist");
    //   String music = myConsole.readLine();
    //   System.out.println("Which Alcohol service would you like: Open Bar, Cash Bar, Kegs");
    //   String bar = myConsole.readLine();
    //   Event party = new Event(type,guests,meal,music,bar);
    //   party.calculateCost();
    //   String receipt = party.displayRequest();
    //   System.out.println(receipt);
    // }
  }
}
