package comparators;

import facultad.Alumno;
import facultad.ElementoFacultad;

public class ComparatorApellido extends ComparatorAlumno{
    public ComparatorApellido() {
        super();
    }

    public ComparatorApellido(ComparatorAlumno nextComparator) {
        super(nextComparator);
    }

    @Override
    public int comp(Alumno alu1, Alumno alu2) {
        return alu1.getApellido().compareTo(alu2.getApellido());
    }
}
