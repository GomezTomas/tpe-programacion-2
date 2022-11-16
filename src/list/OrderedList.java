package list;

public class OrderedList {

    Node startNode;
    Node pointer;
    Order order;

    public OrderedList(){
        startNode = null;
        pointer = null;
        order = new OrderAsc();
    }
    public OrderedList(Order order){
        startNode = null;
        pointer = null;
        this.order = order;
    }

    public void insertNode(Node node){
        if (startNode == null){
            startNode = node;
        }else if(order.getOrder(node, startNode)){
            node.setNextNode(startNode);
            startNode = node;
        } else {
            Node pointer = startNode;
            boolean found = false;
            while (!found && (pointer.getNextNode() != null)) {
                if (order.getOrder(node, pointer.getNextNode())){
                    found = true;
                } else {
                    pointer = pointer.getNextNode();
                }
            }
            node.setNextNode(pointer.nextNode);
            pointer.setNextNode(node);
        }
    }

    public void deleteNode(int position){
        pointer = startNode;
        int pointerPosition = 0;
        while (pointer != null && pointerPosition < (position-1)){
            pointer = pointer.getNextNode();
            pointerPosition++;
        }

        if (position == 0 && startNode != null){
            startNode = startNode.getNextNode();
        }else{
            if(pointer != null){
                Node toDelete = pointer.getNextNode();
                if(toDelete != null){
                    pointer.setNextNode(toDelete.getNextNode());
                }
            }
        }
    }

    public void deleteNode(Node node){
        pointer = startNode;
        while (pointer != null && pointer.getNextNode() != null){
            if (pointer == startNode && pointer.compareTo(node) == 0){
                startNode = startNode.getNextNode();
                pointer = startNode;
            }else if(pointer.getNextNode().compareTo(node) == 0){
                Node toDelete = pointer.getNextNode();
                pointer.setNextNode(toDelete.getNextNode());
            }else{
                pointer = pointer.getNextNode();
            }
        }
    }

    public int getElementPosition(Node node){
        pointer = startNode;
        int pointerPosition = 0;
        while (pointer != null){
            if(pointer.compareTo(node) == 0){
                return pointerPosition;
            }else{
                pointer = pointer.getNextNode();
                pointerPosition++;
            }
        }
        return -1;
    }

    public void print(){
        pointer = startNode;
        while (pointer != null) {
            System.out.println(pointer);
            pointer = pointer.getNextNode();
        }
    }

    private Node getStartNode(){
        return startNode;
    }

    public void setOrder(Order order){
        OrderedList aux = new OrderedList(order);
        pointer = startNode;
        while (pointer != null){
            Node auxNode = new Node(pointer.getElement());
            aux.insertNode(auxNode);
            pointer = pointer.getNextNode();
        }
        startNode = aux.getStartNode();
    }

}
