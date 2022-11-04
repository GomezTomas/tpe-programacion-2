package list;

public class Node {
    int element;
    Node nextNode;

    public Node(int object) {
        this.element = object;
        this.nextNode = null;
    }

    public int getElement() {
        return element;
    }

    public void setObject(int element) {
        this.element = element;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                '}';
    }
}
