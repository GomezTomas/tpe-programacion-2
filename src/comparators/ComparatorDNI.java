package comparators;

import facultad.Alumno;
import facultad.ElementoFacultad;

public class ComparatorDNI extends ComparatorAlumno{
    public ComparatorDNI() {
        super();
    }

    public ComparatorDNI(ComparatorAlumno nextComparator) {
        super(nextComparator);
    }

    @Override
    public int comp(Alumno alu1, Alumno alu2) {
        return alu1.getDni() - alu2.getDni();
    }
}
