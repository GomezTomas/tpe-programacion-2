package list;

public class OrderDesc extends Order{
    @Override
    public boolean isLower(Node newNode, Node existingNode) {
        return (-1 * newNode.compareTo(existingNode)) < 0;
    }
}
