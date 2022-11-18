package comparators;

import facultad.Alumno;
import facultad.ElementoFacultad;

public class ComparatorApellido extends ComparatorElementoFacultad{
    public ComparatorApellido() {
        super();
    }

    public ComparatorApellido(ComparatorElementoFacultad nextComparator) {
        super(nextComparator);
    }

    @Override
    public int comp(ElementoFacultad alu1, ElementoFacultad alu2) {
        try {
            Alumno aluAux1 = (Alumno) alu1;
            Alumno aluAux2 = (Alumno) alu2;
            return aluAux1.getApellido().compareTo(aluAux2.getApellido());
        }catch (Exception e){
            return 1;
        }
    }
}
