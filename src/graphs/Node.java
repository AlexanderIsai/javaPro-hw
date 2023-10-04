package graphs;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private char point;
    private List<Node> connection;

    public Node(char point) {
        this.point = point;
        this.connection = new ArrayList<>();
    }

    public char getPoint() {
        return point;
    }

    public void setPoint(char point) {
        this.point = point;
    }

    public List<Node> getConnection() {
        return connection;
    }

    public void setConnection(List<Node> connection) {
        this.connection = connection;
    }

    public void add(Node node){
        connection.add(node);
    }

    public Node get(char point){
        for (Node node : connection) {
            if (node.point == point){
                return node;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "point=" + point +
                '}';
    }
}
