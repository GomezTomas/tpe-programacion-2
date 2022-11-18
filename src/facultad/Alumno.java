package facultad;

import comparators.*;

import java.util.ArrayList;

public class Alumno extends ElementoFacultad{
//    private String nombre;
    private String apellido;
    private int dni;
    private int edad;
    private ArrayList<String> intereses;
//    private ComparatorElementoFacultad comparator;

    public Alumno(String nombre, String apellido, int dni, int edad) {
        super(nombre);
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        intereses = new ArrayList<>();
        comparator = new ComparatorApellido(new ComparatorNombre(new ComparatorDNI()));
    }

    public int getDni() {
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

//    @Override
//    public int compareTo(Alumno alumno) {
//        return this.comparator.compare(this, alumno);
//    }

    @Override
    public String toString() {
        return apellido + ", " + nombre + ". DNI:" + dni;
    }

    @Override
    public int getCantidadAlumnos() {
        return 1;
    }

}
