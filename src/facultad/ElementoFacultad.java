package facultad;

import comparators.*;

public abstract class ElementoFacultad{
    protected String nombre;
//    protected ComparatorElementoFacultad comparator;

    public ElementoFacultad(String nombre) {
//        this.comparator = new ComparatorCantAlumnos();
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public abstract int getCantidadAlumnos();

}
