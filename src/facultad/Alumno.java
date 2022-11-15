package facultad;

import java.util.ArrayList;

public class Alumno implements Comparable{
    private String nombre;
    private String apellido;
    private long dni;
    private int edad;
    private ArrayList<String> intereses;

    public Alumno(String nombre, String apellido, long dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        intereses = new ArrayList<>();
    }

    public long getDni() {
        return dni;
    }

    public ArrayList<String> getIntereses() {
        return new ArrayList<>(intereses);
    }

    public void addIntereses(String palabra){
        if(!intereses.contains(palabra)){
            intereses.add(palabra);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Object o) {
        Alumno alumno = (Alumno) o;
        if (this.apellido.compareTo(alumno.getApellido()) != 0){
            return this.apellido.compareTo(alumno.getApellido());
        }
        if (this.nombre.compareTo(alumno.getNombre()) != 0){
            return this.nombre.compareTo(alumno.getNombre());
        }

        return (int) (this.dni - alumno.dni);
    }

    @Override
    public String toString() {
        return "facultad.Alumno{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }

}
