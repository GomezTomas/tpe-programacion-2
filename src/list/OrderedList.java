package list;

import comparators.ComparatorGenerico;
import comparators.ComparatorInverso;

import java.util.Comparator;
import java.util.Iterator;

public class OrderedList<T> implements Iterable<T>{

    private Node<T> startNode;
    private Node<T> pointer;
    private Comparator<T> comparator;


    public OrderedList(){
        this(new ComparatorGenerico<>());
    }

    public OrderedList(Comparator<T> comparator){
        this.startNode = null;
        this.pointer = null;
        this.comparator = comparator;
    }

    public void insertElement(T element){
        Node<T> node = new Node<>(element);
        if (this.startNode == null){
            this.startNode = node;
        }else if(this.comparator.compare(node.getElement(), this.startNode.getElement()) < 0){
            node.setNextNode(this.startNode);
            this.startNode = node;
        } else {
            this.pointer = this.startNode;
            boolean found = false;
            while (!found && (this.pointer.getNextNode() != null)) {
                if (this.comparator.compare(node.getElement(), this.pointer.getNextNode().getElement()) < 0){
                    found = true;
                } else {
                    this.pointer = this.pointer.getNextNode();
                }
            }
            node.setNextNode(this.pointer.getNextNode());
            this.pointer.setNextNode(node);
        }
    }

    public void deleteNode(int position){
        if(position < 0)
            return;
        if(this.startNode == null)
            return;
        if (position == 0) {
            this.startNode = this.startNode.getNextNode();
            return;
        }
        this.pointer = this.startNode;
        int pointerPosition = 0;
        while (this.pointer != null && pointerPosition < (position-1)){
            this.pointer = this.pointer.getNextNode();
            pointerPosition++;
        }
        if(this.pointer != null){
            Node<T> toDelete = this.pointer.getNextNode();
            if(toDelete != null){
                this.pointer.setNextNode(toDelete.getNextNode());
            }
        }
    }

    public void deleteNode(T element){
        boolean deleteFirstNode = false;
        if(this.startNode == null)
            return;
        this.pointer = this.startNode;
        if(!(this.comparator.compare(this.pointer.getElement(), element) == 0)) {
            while (this.pointer.getNextNode() != null && !(this.comparator.compare(this.pointer.getNextNode().getElement(), element) == 0)) {
                pointer = pointer.getNextNode();
            }
        }else{
            deleteFirstNode = true;
        }
        Node<T> auxAnterior = pointer;
        pointer = pointer.getNextNode();

        while (this.pointer != null && this.comparator.compare(this.pointer.getElement(), element) == 0) {
            pointer = pointer.getNextNode();
        }
        if (deleteFirstNode){
            startNode = pointer;
        }else{
            auxAnterior.setNextNode(this.pointer);
        }
    }

    public int getElementPosition(T element){
        this.pointer = this.startNode;
        int pointerPosition = 0;
        while (this.pointer != null){
            if(this.comparator.compare(this.pointer.getElement(),element) == 0){
                return pointerPosition;
            }else{
                this.pointer = this.pointer.getNextNode();
                pointerPosition++;
            }
        }
        return -1;
    }

    private Node<T> getStartNode(){
        return this.startNode;
    }

    private void invertOrder(Comparator<T> comparator){
        OrderedList<T> aux = new OrderedList<>(new ComparatorInverso<>(comparator));
        this.pointer = this.startNode;
        while (this.pointer != null){
            aux.insertElement(this.pointer.getElement());
            this.pointer = this.pointer.getNextNode();
        }
        this.startNode = aux.getStartNode();
    }

    public void invertOrder(){
        invertOrder(this.comparator);
    }

    public void setComparator(Comparator<T> comparator) {
        this.invertOrder(comparator);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator<>(this.startNode);
    }
}
