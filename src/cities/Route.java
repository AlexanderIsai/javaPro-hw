package cities;

import java.util.*;

public class Route {

    int transfer = 0;
    Scanner scanner = new Scanner(System.in);

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
        if (transfer == 20) {
            System.out.println("Das ist impossible");
            return false;
        }
        String departure = search[0];
        String arrive = search[1];
        System.out.println(departure + " - " + routes.get(departure));
        if (routes.get(departure).equals(arrive)) {
            System.out.println("S priezdom " + (transfer - 1));
            return true;
        } else {
            search[0] = routes.get(departure);
            return isPossibleToFly(routes, search);
        }
    }

}

