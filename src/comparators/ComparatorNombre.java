package comparators;

import facultad.Alumno;
import facultad.ElementoFacultad;

public class ComparatorNombre extends ComparatorElementoFacultad{
    public ComparatorNombre() {
        super();
    }

    public ComparatorNombre(ComparatorElementoFacultad nextComparator) {
        super(nextComparator);
    }

    @Override
    public int comp(ElementoFacultad alu1, ElementoFacultad alu2) {
        try {
            Alumno aluAux1 = (Alumno) alu1;
            Alumno aluAux2 = (Alumno) alu2;
            return aluAux1.getNombre().compareTo(aluAux2.getNombre());
        }catch (Exception e){
            return 1;
        }
    }
}
