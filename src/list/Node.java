package list;

public class Node implements Comparable{
    Object element;
    Node nextNode;

    public Node(Object object) {
        this.element = object;
        this.nextNode = null;
    }

    public Object getElement() {
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

    @Override
    public int compareTo(Object o) {
        return ((Comparable) element).compareTo(((Node)o).getElement());
    }
}
