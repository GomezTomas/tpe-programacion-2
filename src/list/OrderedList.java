package list;

import comparators.ComparatorGenerico;

import java.util.Comparator;
import java.util.Iterator;

public class OrderedList<T> implements Iterable<T>{

    Node<T> startNode;
    Node<T> pointer;
    Order<T> order;
    Comparator<T> comparator;


    public OrderedList(Comparator<T> comparator){
        this(new OrderAsc<>(), comparator);
    }

    public OrderedList(){
        order = new OrderAsc<>();
        comparator = new ComparatorGenerico<>();
    }
    public OrderedList(Order<T> order, Comparator<T> comparator){
        startNode = null;
        pointer = null;
        this.order = order;
        this.comparator = comparator;
    }

    public void insertNode(Node<T> node){
        if (startNode == null){
            startNode = node;
        }else if(order.isLower(node, startNode, comparator)){
            node.setNextNode(startNode);
            startNode = node;
        } else {
            pointer = startNode;
            boolean found = false;
            while (!found && (pointer.getNextNode() != null)) {
                if (order.isLower(node, pointer.getNextNode(), comparator)){
                    found = true;
                } else {
                    pointer = pointer.getNextNode();
                }
            }
            node.setNextNode(pointer.getNextNode());
            pointer.setNextNode(node);
        }
    }

    public void deleteNode(int position){
        if(position < 0)
            return;

        if(startNode == null)
            return;

        if (position == 0){
            startNode = startNode.getNextNode();
            return;
        }

        pointer = startNode;
        int pointerPosition = 0;

        while (pointer != null && pointerPosition < (position-1)){
            pointer = pointer.getNextNode();
            pointerPosition++;
        }

        if(pointer != null){
            Node<T> toDelete = pointer.getNextNode();
            if(toDelete != null){
                pointer.setNextNode(toDelete.getNextNode());
            }
        }

    }

    public void deleteNode(Node<T> node){
        if(startNode == null)
            return;

        pointer = startNode;
        while (pointer.getNextNode() != null){
            if (pointer == startNode && comparator.compare(pointer.getElement(), node.getElement()) == 0){
                startNode = startNode.getNextNode();
                pointer = startNode;
            }else if(comparator.compare(pointer.getNextNode().getElement(), node.getElement()) == 0){
                Node<T> toDelete = pointer.getNextNode();
                pointer.setNextNode(toDelete.getNextNode());
            }else{
                pointer = pointer.getNextNode();
            }
        }

        if(comparator.compare(startNode.getElement(), node.getElement()) == 0){
            startNode = null;
        }
    }

    public int getElementPosition(Node<T> node){
        pointer = startNode;
        int pointerPosition = 0;
        while (pointer != null){
            if(comparator.compare(pointer.getElement(),node.getElement()) == 0){
                return pointerPosition;
            }else{
                pointer = pointer.getNextNode();
                pointerPosition++;
            }
        }
        return -1;
    }

    private Node<T> getStartNode(){
        return startNode;
    }

    public void setOrder(Order<T> order){
        OrderedList<T> aux = new OrderedList<>(order, comparator);
        pointer = startNode;
        while (pointer != null){
            Node<T> auxNode = new Node<>(pointer.getElement());
            aux.insertNode(auxNode);
            pointer = pointer.getNextNode();
        }
        startNode = aux.getStartNode();
    }

    public void setComparator(Comparator<T> comparator){
        this.comparator = comparator;
        this.setOrder(this.order);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator<>(startNode);
    }

}
