package facultad;

public abstract class ElementoFacultad{
    protected String nombre;

    public ElementoFacultad(String nombre) {
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
