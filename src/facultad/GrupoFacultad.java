package facultad;

import comparators.*;
import list.Node;
import list.OrderedList;

public class GrupoFacultad extends ElementoFacultad{

    private OrderedList<ElementoFacultad> listaElementos;


    public GrupoFacultad(String nombre){
        super(nombre);
        this.listaElementos = new OrderedList<>(super.comparator);
    }

    public void setComparator(ComparatorElementoFacultad comparator) {
        super.comparator = comparator;
        this.listaElementos.setComparator(comparator);
    }

    public void addElemento(ElementoFacultad elementoFacultad){
        this.listaElementos.insertNode(new Node<>(elementoFacultad));
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
}
