package facultad;

import comparators.ComparatorCantAlumnos;
import comparators.ComparatorNombre;

public class MainComposite {
    public static void main(String[] args) {
        Alumno martin = new Alumno("Martin", "Gomez", 34111222, 18);
        Alumno jhon = new Alumno("Jhon", "Doe", 12000000, 18);
        Alumno mora = new Alumno("Mora", "Diaz", 37124425, 18);
        Alumno roman = new Alumno("Roman", "Bazan", 32555111, 18);
        Alumno flora = new Alumno("Flora", "Rivas", 34555111, 18);
        Alumno juana = new Alumno("Juana", "Garcia", 27123455, 18);
        Alumno federico = new Alumno("Federico", "Lopez", 35999888, 18);

        GrupoFacultad unicen = new GrupoFacultad("unicen");
        GrupoFacultad humanas = new GrupoFacultad("humanas");
        GrupoFacultad exactas = new GrupoFacultad("exactas");
        GrupoFacultad historia = new GrupoFacultad("Historia");

        exactas.addElemento(federico);
        exactas.addElemento(juana);


        historia.addElemento(flora);
        historia.addElemento(martin);
        historia.addElemento(roman);

        humanas.addElemento(mora);
        humanas.addElemento(historia);

        unicen.addElemento(jhon);
        unicen.addElemento(humanas);
        unicen.addElemento(exactas);


//        historia.print();
//        historia.setComparator(new ComparatorCantAlumnos(new ComparatorNombre()));
//        historia.print();

        unicen.print();
    }

}
