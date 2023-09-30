package cities;

import java.util.Map;
import java.util.Objects;

public class MapOfCities {

    private Map<String, String> routes;

    public MapOfCities() {
    }

    public Map<String, String> getRoutes() {
        return routes;
    }

    public void setRoutes(Map<String, String> routes) {
        this.routes = routes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapOfCities that = (MapOfCities) o;

        return Objects.equals(routes, that.routes);
    }

    @Override
    public int hashCode() {
        return routes != null ? routes.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "MapOfCities{" +
                "routes=" + routes +
                '}';
    }
}
