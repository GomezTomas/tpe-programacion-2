package list;

import java.util.Comparator;

public class OrderDesc<T> extends Order<T>{

    @Override
    public boolean isLower(Node<T> newNode, Node<T> existingNode, Comparator<T> comparator) {
        return -1 * comparator.compare(newNode.getElement(), existingNode.getElement()) < 0;
    }
}
