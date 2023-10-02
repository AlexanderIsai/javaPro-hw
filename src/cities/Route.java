package cities;

import java.util.*;

public class Route {

    int transfer = -1;
    Scanner scanner = new Scanner(System.in);
    Map<String, String> flights = new HashMap<>();

    public Route() {
    }


    public String[] createSearching() {
        String[] searching = new String[2];
        System.out.println("Enter city of departure");
        searching[0] = scanner.nextLine();
        System.out.println("Enter city of arrive");
        searching[1] = scanner.nextLine();
        return searching;
    }

    public boolean isPossibleToFly(Map<String, String> routes, String[] search) {
        if (routes == null || search == null || !routes.containsKey(search[0]) || !routes.containsValue(search[1])) {
            return false;
        }
        transfer++;
        if (transfer > 1 && flights.containsKey(search[0])) {
            System.out.println("Das ist impossible, wir tried " + transfer + " mals");
            return false;
        }
        flights.put(search[0], routes.get(search[0]));
        String departure = search[0];
        String arrive = search[1];
        System.out.println(departure + " - " + routes.get(departure));
        if (routes.get(departure).equals(arrive)) {
            System.out.println("S priezdom " + (transfer));
            return true;
        } else {
            search[0] = routes.get(departure);
            return isPossibleToFly(routes, search);
        }
    }

    @Override
    public String toString() {
        return "Route{" +
                "transfer=" + transfer +
                ", flights=" + flights +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Route route = (Route) o;

        if (transfer != route.transfer) return false;
        return Objects.equals(flights, route.flights);
    }

    @Override
    public int hashCode() {
        int result = transfer;
        result = 31 * result + (flights != null ? flights.hashCode() : 0);
        return result;
    }
}

