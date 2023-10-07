package graphs;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Graph {

    private Map<String, Map<String, Integer>> route;

    public Graph() {
        route = new HashMap<>();
    }

    public Map<String, Map<String, Integer>> getRoute() {
        return route;
    }


    public void add(String pointFrom, String pointTo, int distance){
        route.computeIfAbsent(pointFrom, k -> new HashMap<>()).put(pointTo, distance);
        route.computeIfAbsent(pointTo, k -> new HashMap<>()).put(pointFrom, distance);
    }

    public Map<String, Integer> getNearest(String vertex){
        return route.get(vertex);
    }

    public Set<String> getVertexes(){
        return route.keySet();
    }

    public int getDistance (String pointFrom, String pointTo){
        return route.get(pointFrom).get(pointTo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Graph graph = (Graph) o;

        return Objects.equals(route, graph.route);
    }

    @Override
    public int hashCode() {
        return route != null ? route.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "route=" + route +
                '}';
    }
}
