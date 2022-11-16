package Comparators;

import facultad.Alumno;

public class ComparatorNombre extends ComparatorAlumno{
    public ComparatorNombre() {
        this.nextComparator = null;
    }

    public ComparatorNombre(ComparatorAlumno nextComparator) {
        this.nextComparator = nextComparator;
    }

    @Override
    public int comp(Alumno alu1, Alumno alu2) {
        return alu1.getNombre().compareTo(alu2.getNombre());
    }
}
