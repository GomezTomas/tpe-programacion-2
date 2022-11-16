package facultad;

public abstract class ElementoFacultad {
    protected String nombre;

    public String getNombre(){
        return this.nombre;
    }
    public boolean equals(Object obj) {
        return this.getNombre().equals(((ElementoFacultad) obj).getNombre());
    }
    public abstract int getCantidadAlumnos();
}
