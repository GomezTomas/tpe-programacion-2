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

//        System.out.println("----------------------------------");
//        this.print();
    }

    public void deleteNode(int position){
        pointer = startNode;
        int pointerPosition = 0;
        while (pointer != null && pointerPosition < (position-1)){
            pointer = pointer.getNextNode();
            pointerPosition++;
        }

        if (position == 0){
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

    public void deleteNode(Node element){
        pointer = startNode;
        int pointerPosition = 0;
        while (pointer != null){
            if(pointer.getElement() == element.getElement()){
                this.deleteNode(pointerPosition);
            };
            pointerPosition++;
            pointer = pointer.getNextNode();
        }
    }

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
