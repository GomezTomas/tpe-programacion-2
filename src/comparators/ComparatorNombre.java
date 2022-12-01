package comparators;

import facultad.Alumno;
import facultad.ElementoFacultad;

public class ComparatorNombre extends ComparatorAlumno{
    public ComparatorNombre() {
        super();
    }

    public ComparatorNombre(ComparatorAlumno nextComparator) {
        super(nextComparator);
    }

    @Override
    public int comp(Alumno alu1, Alumno alu2) {
        return alu1.getNombre().compareTo(alu2.getNombre());
    }
}
