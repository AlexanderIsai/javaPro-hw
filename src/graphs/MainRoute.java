package graphs;

import java.util.*;

public class MainRoute {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Graph graph = new Graph();
        graph.add("Рейкьявик", "Осло", 5);
        graph.add("Рейкьявик", "Лондон", 4);
        graph.add("Осло", "Москва", 3);
        graph.add("Осло", "Берлин", 1);
        graph.add("Лондон", "Берлин", 3);
        graph.add("Берлин", "Рим", 2);
        graph.add("Берлин", "Белград", 9);
        graph.add("Рим", "Афины", 2);
        graph.add("Белград", "Афины", 1);
        graph.add("Москва", "Белград", 5);
        graph.add("Москва", "Афины", 4);

        System.out.println(graph);
        System.out.println("Введите точку вылета");
        String start = scanner.nextLine();
        System.out.println("Введите точку назначения");
        String end = scanner.nextLine();

        Map<String, Integer> distances = new HashMap<>();
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.comparingInt(distances::get));
        Set<String> visitedPoints = new HashSet<>();

        distances.put(start, 0);
        queue.offer(start);


        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (current.equals(end)) {
                System.out.println("Кратчайший путь из " + start + " в " + end + ": " + distances.get(end));
                break;
            }
            visitedPoints.add(current);

            for (String near: graph.getNearest(current).keySet()) {
                if(!visitedPoints.contains(near)){
                    int distance = distances.get(current) + graph.getDistance(current, near);
                    if(!distances.containsKey(near) || distance < distances.get(near)){
                        distances.put(near, distance);
                        queue.offer(near);
                    }
                }
            }

        }
    }
}
