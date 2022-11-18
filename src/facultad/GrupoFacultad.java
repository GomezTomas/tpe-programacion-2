package facultad;

import comparators.*;
import list.Node;
import list.OrderedList;


public class GrupoFacultad extends ElementoFacultad{

    private OrderedList<ElementoFacultad> listaElementos;
//    private int cantidadAlumnos;
    private ComparatorElementoFacultad comparator;

    public GrupoFacultad(String nombre){
        super(nombre);
        this.comparator = new ComparatorCantAlumnos(
                                new ComparatorApellido(
                                    new ComparatorNombre(
                                        new ComparatorDNI()
                                    )
                                )
                                                );

        listaElementos = new OrderedList<>(comparator);
    }

    public void setComparator(ComparatorElementoFacultad comparator) {
        this.comparator = comparator;
        listaElementos.setComparator(comparator);
    }

    public void print(){
        for (Object elem : listaElementos){
            System.out.println(elem);
        }
    }

    public void addElemento(ElementoFacultad elementoFacultad){
        listaElementos.insertNode(new Node<>(elementoFacultad));
    }

//    @Override
    public int getCantidadAlumnos() {
        int suma = 0;
        for (ElementoFacultad elem : listaElementos){
            suma += elem.getCantidadAlumnos();
        }
//        return this.cantidadAlumnos;
        return suma;
    }

    @Override
    public String toString() {
        String result = this.nombre;
        for (ElementoFacultad elem : listaElementos){
            result = result + ", " + elem.toString();
        }
        return result;
    }
}
