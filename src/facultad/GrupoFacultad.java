package facultad;

import comparators.*;
import list.Node;
import list.OrderedList;

import java.util.ArrayList;

public class GrupoFacultad extends ElementoFacultad{

//    private OrderedList<ElementoFacultad> listaElementos;
    private ArrayList<ElementoFacultad> listaElementos;


    public GrupoFacultad(String nombre){
        super(nombre);
//        this.listaElementos = new OrderedList<>(super.comparator);
        this.listaElementos = new ArrayList<>();
    }

//    public void setComparator(ComparatorElementoFacultad comparator) {
//        super.comparator = comparator;
//        this.listaElementos.setComparator(comparator);
//    }

    public void addElemento(ElementoFacultad elementoFacultad){
//        this.listaElementos.insertNode(elementoFacultad);
        if(!this.listaElementos.contains(elementoFacultad)){
            this.listaElementos.add(elementoFacultad);
        }
    }

    public int getCantidadAlumnos() {
        int suma = 0;
        for (ElementoFacultad elem : this.listaElementos){
            suma += elem.getCantidadAlumnos();
        }
        return suma;
    }

    @Override
    public String toString() {
        String result = this.nombre;
        for (ElementoFacultad elem : this.listaElementos){
            result = result + ", " + elem.toString();
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return this.nombre.equals(((GrupoFacultad) obj).getNombre());
    }
}
