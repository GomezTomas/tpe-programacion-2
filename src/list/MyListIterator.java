package list;

import java.util.Iterator;

public class MyListIterator<T> implements Iterator<T> {

    private Node<T> pointer;

    public MyListIterator(Node<T> pointer) {
        this.pointer = pointer;
    }

    @Override
    public boolean hasNext() {
        return pointer != null;
    }


    @Override
    public T next() {
        T value = pointer.getElement();
        pointer = pointer.getNextNode();
        return value;
    }

    protected void setPointer(Node<T> node){
        this.pointer = node;
    }


}
