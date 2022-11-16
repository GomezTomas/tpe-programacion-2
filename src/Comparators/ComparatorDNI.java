package Comparators;

import facultad.Alumno;

public class ComparatorDNI extends ComparatorAlumno{
    public ComparatorDNI() {
        this.nextComparator = null;
    }

    public ComparatorDNI(ComparatorAlumno nextComparator) {
        this.nextComparator = nextComparator;
    }

    @Override
    public int comp(Alumno alu1, Alumno alu2) {
        return alu1.getDni() - alu2.getDni();
    }
}
