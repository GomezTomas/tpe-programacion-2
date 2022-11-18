package comparators;

import facultad.ElementoFacultad;

import java.util.Comparator;

public abstract class ComparatorElementoFacultad implements Comparator<ElementoFacultad> {
    ComparatorElementoFacultad nextComparator;

    public ComparatorElementoFacultad() {
        nextComparator = null;
    }

    public ComparatorElementoFacultad(ComparatorElementoFacultad nextComparator) {
        this.nextComparator = nextComparator;
    }

    public abstract int comp(ElementoFacultad o1, ElementoFacultad o2);

    @Override
    public int compare(ElementoFacultad o1, ElementoFacultad o2) {
        int result = this.comp(o1, o2);
        if (result == 0 && nextComparator != null){
            return nextComparator.compare(o1, o2);
        }
        return result;
    }
}
