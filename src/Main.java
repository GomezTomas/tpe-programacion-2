import list.Node;
import list.OrderedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        OrderedList lista = new OrderedList();

        lista.insertNode(new Node(3));
        lista.insertNode(new Node(5));
        lista.insertNode(new Node(6));
        lista.insertNode(new Node(1));
        lista.insertNode(new Node(2));
        lista.insertNode(new Node(4));
    }
}