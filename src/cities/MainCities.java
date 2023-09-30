package cities;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainCities {

    public static void main(String[] args) {

        MapOfCities mapOfCities = new MapOfCities();
        Map<String, String> routes = new HashMap<>();
        routes.put("Dortmund", "Roma");
        routes.put("Berlin", "London");
        routes.put("Frankfurt", "Napoli");
        routes.put("London", "Frankfurt");
        routes.put("Prague", "Wien");
        routes.put("Napoli", "Munich");
        routes.put("Munich", "Dortmund");
        routes.put("Roma", "Berlin");
        routes.put("Wien", "Amsterdam");
        routes.put("Amsterdam", "Paris");
        routes.put("Paris", "Prague");
        mapOfCities.setRoutes(routes);
        System.out.println(mapOfCities);
        Route route = new Route();
        System.out.println(route.isPossibleToFly(mapOfCities.getRoutes(), route.createSearching()));
    }
}
