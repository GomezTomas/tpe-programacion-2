package list;

public class Node implements Comparable<Node>{
    Object element;
    Node nextNode;

    public Node(Object object) {
        this.element = object;
        this.nextNode = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(int element) {
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

    @Override
    public int compareTo(Node node) {
        return ((Comparable) element).compareTo(node.getElement());
    }
}
