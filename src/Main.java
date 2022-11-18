import facultad.Alumno;
import list.Node;
import list.OrderAsc;
import list.OrderDesc;
import list.OrderedList;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        OrderedList listaNumeros = new OrderedList();

        listaNumeros.insertNode(new Node(10));
        listaNumeros.insertNode(new Node(21));
        listaNumeros.insertNode(new Node(1));
        listaNumeros.insertNode(new Node(5));
        listaNumeros.insertNode(new Node(11));

        for(Object elem : listaNumeros){
            System.out.println(elem);
        }

        listaNumeros.deleteNode(0);
        listaNumeros.deleteNode(new Node(5));
        listaNumeros.deleteNode(new Node(11));

        System.out.println("----------------------------------------");

        for(Object elem : listaNumeros){
            System.out.println(elem);
        }

        OrderedList listaPalabras = new OrderedList();
        listaPalabras.insertNode(new Node("Facil"));
        listaPalabras.insertNode(new Node("Es"));
        listaPalabras.insertNode(new Node("Parcial"));
        listaPalabras.insertNode(new Node("Prog 2"));

        System.out.println("----------------------------------------");
        for(Object elem : listaPalabras){
            System.out.println(elem);
        }

        System.out.println("----------------------------------------");
        System.out.println(listaPalabras.getElementPosition(new Node("Parcial")));
        System.out.println(listaPalabras.getElementPosition(new Node("Recuperatorio")));
        listaPalabras.setOrder(new OrderDesc());
        System.out.println("----------------------------------------");
        for(Object elem : listaPalabras){
            System.out.println(elem);
        }

    }
}