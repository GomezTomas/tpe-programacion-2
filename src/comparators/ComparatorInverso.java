package comparators;

import java.util.Comparator;

public class ComparatorInverso<T> implements Comparator<T>{
    private Comparator<T> comparator;

    public ComparatorInverso(Comparator<T> c){
        this.comparator = c;
    }

    @Override
    public int compare(T o1, T o2) {
        return -1 * comparator.compare(o1, o2);
    }
}
