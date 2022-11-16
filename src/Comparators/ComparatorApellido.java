package Comparators;

import facultad.Alumno;

public class ComparatorApellido extends ComparatorAlumno{
    public ComparatorApellido() {
        this.nextComparator = null;
    }

    public ComparatorApellido(ComparatorAlumno nextComparator) {
        this.nextComparator = nextComparator;
    }

    @Override
    public int comp(Alumno alu1, Alumno alu2) {
        return alu1.getApellido().compareTo(alu2.getApellido());
    }
}
