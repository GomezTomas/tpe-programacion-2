package list;

public class OrderedList {

    Node startNode;
    Node pointer;

    public OrderedList(){
        startNode = null;
        pointer = null;
    }

    public void insertNode(Node node){
        if (startNode == null){
            startNode = node;
        } else if (node.getElement() < startNode.getElement() ) {
            node.setNextNode(startNode);
            startNode = node;
        } else {
            pointer = startNode;
            boolean found = false;
            while (!found && (pointer.getNextNode() != null)) {
                if (node.getElement() < pointer.getNextNode().getElement()) {
                    found = true;
                } else {
                    pointer = pointer.getNextNode();
                }
            }
            node.setNextNode(pointer.nextNode);
            pointer.setNextNode(node);
        }

        System.out.println("----------------------------------");
        this.print();
    }

//    public void deleteNode(int position){
//
//    }

//    public void deleteNode(Node element){
//
//    }

//    public int getElement(Object element){
//        return 1;
//    }

    public void print(){
        pointer = startNode;
        while (pointer != null) {
            System.out.println(pointer);
            pointer = pointer.nextNode;
        }
    }

//    public void setOrder(OrderBy order){
//
//    }

}
