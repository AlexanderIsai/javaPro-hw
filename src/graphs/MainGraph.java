package graphs;

public class MainGraph {

    public static void main(String[] args) {
        Node node1 = new Node('А');
        Node node2 = new Node('Б');
        Node node3 = new Node('В');
        Node node4 = new Node('Г');
        Node node5 = new Node('Д');
        Node node6 = new Node('Е');
        Node node7 = new Node('Ж');
        Node node8 = new Node('З');
        Node node9 = new Node('И');
        Node node10 = new Node('К');

        node1.add(node2);
        node1.add(node3);
        node1.add(node4);
        node1.add(node5);

        node2.add(node6);
        node2.add(node3);

        node3.add(node7);

        node4.add(node8);

        node5.add(node4);
        node5.add(node9);

        node6.add(node10);

        node7.add(node10);
        node7.add(node8);

        node8.add(node10);

        node9.add(node10);

        System.out.println(node10);
        System.out.println(node10.getConnection());

    }
}
