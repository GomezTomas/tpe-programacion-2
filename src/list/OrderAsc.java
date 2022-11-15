package list;

public class OrderAsc extends Order{
    @Override
    public boolean getOrder(Node newNode, Node existingNode) {
        return newNode.compareTo(existingNode) < 0;
    }
}
