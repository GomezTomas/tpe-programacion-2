package facultad;

import Comparators.ComparatorAlumno;
import Comparators.ComparatorApellido;
import Comparators.ComparatorDNI;
import Comparators.ComparatorNombre;

import java.util.ArrayList;
import java.util.Objects;

public class Alumno extends ElementoFacultad implements Comparable<Alumno>{
//    private String nombre;
    private String apellido;
    private int dni;
    private int edad;
    private ArrayList<String> intereses;
    private ComparatorAlumno comparator;

    public Alumno(String nombre, String apellido, int dni, int edad) {
        this.nombre = nombre;
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

    @Override
    public int compareTo(Alumno alumno) {
        return this.comparator.compare(this, alumno);
    }

    @Override
    public String toString() {
        return "facultad.Alumno{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }

    @Override
    public int getCantidadAlumnos() {
        return 1;
    }

//    @Override
//    public boolean equals(Object o) {
//        return this.compareTo(o) == 0;
//    }
}
