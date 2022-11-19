package list;

import comparators.ComparatorGenerico;

import java.util.Comparator;
import java.util.Iterator;

public class OrderedList<T> implements Iterable<T>{

    private Node<T> startNode;
    private Node<T> pointer;
    private Order<T> order;
    private Comparator<T> comparator;

    public OrderedList(Comparator<T> comparator){
        this(new OrderAsc<>(), comparator);
    }

    public OrderedList(){
        this.order = new OrderAsc<>();
        this.comparator = new ComparatorGenerico<>();
    }

    public OrderedList(Order<T> order, Comparator<T> comparator){
        this.startNode = null;
        this.pointer = null;
        this.order = order;
        this.comparator = comparator;
    }

    public void insertNode(Node<T> node){
        if (this.startNode == null){
            this.startNode = node;
        }else if(this.order.isLower(node, this.startNode, this.comparator)){
            node.setNextNode(this.startNode);
            this.startNode = node;
        } else {
            this.pointer = this.startNode;
            boolean found = false;
            while (!found && (this.pointer.getNextNode() != null)) {
                if (this.order.isLower(node, this.pointer.getNextNode(), this.comparator)){
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

    public void deleteNode(Node<T> node){
        if(this.startNode == null)
            return;
        this.pointer = this.startNode;
        while (this.pointer.getNextNode() != null){
            if (this.pointer == this.startNode && this.comparator.compare(this.pointer.getElement(), node.getElement()) == 0){
                this.startNode = this.startNode.getNextNode();
                this.pointer = this.startNode;
            }else if(this.comparator.compare(this.pointer.getNextNode().getElement(), node.getElement()) == 0){
                Node<T> toDelete = this.pointer.getNextNode();
                this.pointer.setNextNode(toDelete.getNextNode());
            }else{
                this.pointer = this.pointer.getNextNode();
            }
        }
        if(this.comparator.compare(this.startNode.getElement(), node.getElement()) == 0){
            this.startNode = null;
        }
    }

    public int getElementPosition(Node<T> node){
        this.pointer = this.startNode;
        int pointerPosition = 0;
        while (this.pointer != null){
            if(this.comparator.compare(this.pointer.getElement(),node.getElement()) == 0){
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

    public void setOrder(Order<T> order){
        OrderedList<T> aux = new OrderedList<>(order, this.comparator);
        this.pointer = this.startNode;
        while (this.pointer != null){
            Node<T> auxNode = new Node<>(this.pointer.getElement());
            aux.insertNode(auxNode);
            this.pointer = this.pointer.getNextNode();
        }
        this.startNode = aux.getStartNode();
    }

    public void setComparator(Comparator<T> comparator){
        this.comparator = comparator;
        this.setOrder(this.order);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator<>(this.startNode);
    }
}
