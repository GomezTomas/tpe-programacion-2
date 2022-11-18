package comparators;

import facultad.Alumno;
import facultad.ElementoFacultad;

public class ComparatorDNI extends ComparatorElementoFacultad{
    public ComparatorDNI() {
        super();
    }

    public ComparatorDNI(ComparatorElementoFacultad nextComparator) {
        super(nextComparator);
    }

    @Override
    public int comp(ElementoFacultad alu1, ElementoFacultad alu2) {
        try {
            Alumno aluAux1 = (Alumno) alu1;
            Alumno aluAux2 = (Alumno) alu2;
            return aluAux1.getDni() - aluAux2.getDni();
        }catch (Exception e){
            return 1;
        }
    }
}
