package list;

public class Node<T>{
    T element;
    Node<T> nextNode;

    public Node(T element) {
        this.element = element;
        this.nextNode = null;
    }

    public T getElement() {
        return this.element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
