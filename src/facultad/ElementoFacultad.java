package facultad;

import comparators.*;

public abstract class ElementoFacultad implements Comparable<ElementoFacultad>{
    protected String nombre;
    protected ComparatorElementoFacultad comparator;

    public ElementoFacultad(String nombre) {
        comparator = new ComparatorCantAlumnos(new ComparatorApellido(new ComparatorNombre(new ComparatorDNI())));
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public abstract int getCantidadAlumnos();

    @Override
    public int compareTo(ElementoFacultad o) {
        return this.getCantidadAlumnos() - o.getCantidadAlumnos();
    }
}
