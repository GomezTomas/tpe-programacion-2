package list;

import java.util.Iterator;

public class MyListIterator<T> implements Iterator<T> {

    private Node<T> pointer;

    public MyListIterator(Node<T> pointer) {
        this.pointer = pointer;
    }

    @Override
    public boolean hasNext() {
        return this.pointer != null;
    }

    @Override
    public T next() {
        T value = this.pointer.getElement();
        this.pointer = this.pointer.getNextNode();
        return value;
    }
}
