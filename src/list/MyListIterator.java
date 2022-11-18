package list;

import java.util.Iterator;

public class MyListIterator implements Iterator {

    private Node pointer;

    public MyListIterator(Node pointer) {
        this.pointer = pointer;
    }

    @Override
    public boolean hasNext() {
        return pointer != null;
    }


    @Override
    public Object next() {
        Object value = pointer.getElement();
        pointer = pointer.getNextNode();
        return value;
    }

    protected void setPointer(Node node){
        this.pointer = node;
    }


}
