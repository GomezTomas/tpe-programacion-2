package facultad;

import list.Node;
import list.OrderedList;

import java.util.ArrayList;

public class GrupoFacultad extends ElementoFacultad{

    private OrderedList listaElementos;
    private int cantidadAlumnos;

    public GrupoFacultad(String nombre, int cantidadAlumnos){
        super(nombre);
        listaElementos = new OrderedList();
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public void print(){
        this.listaElementos.print();
    }

    public void addElemento(ElementoFacultad elementoFacultad){
//        if(!elementos.contains(elementoFacultad)){
//            int i = 0;
//            while (i<elementos.size() && elementoFacultad.getCantidadAlumnos() > elementos.get(i).getCantidadAlumnos()){
//                i++;
//            }
//            elementos.add(i, elementoFacultad);
//        }
        listaElementos.insertNode(new Node(elementoFacultad));
    }

//    @Override
    public int getCantidadAlumnos() {
//        int suma = 0;
//        for (ElementoFacultad elem : elementos){
//            suma += elem.getCantidadAlumnos();
//        }
        return this.cantidadAlumnos;
//        return suma;
    }

//    @Override
//    public int compareTo(GrupoFacultad grupo) {
//        return getCantidadAlumnos() -  grupo.getCantidadAlumnos();
//    }

    //
//    public void print(){
//        for (ElementoFacultad elem: elementos){
//            System.out.println(elem);
//        }
//    }
//
    @Override
    public String toString() {
        return this.nombre  + ", " + this.getCantidadAlumnos();
    }
}
