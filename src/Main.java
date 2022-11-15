import list.Node;
import list.OrderAsc;
import list.OrderDesc;
import list.OrderedList;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//
//        OrderedList lista = new OrderedList();
//
//        lista.insertNode(new Node(3));
//        lista.insertNode(new Node(3));
//        lista.insertNode(new Node(1));
//        lista.insertNode(new Node(1));
//        lista.insertNode(new Node(1));
//        lista.insertNode(new Node(1));
//        lista.insertNode(new Node(2));
//        lista.insertNode(new Node(4));
//
////        lista.deleteNode(new Node(1));
//
//        lista.print();
//
//        System.out.println("------------------------------------------------");
//        lista.setOrder(new OrderDesc());
//        lista.print();
//
//
//        System.out.println("------------------------------------------------");
//
//        lista.setOrder(new OrderAsc());
//        lista.print();
//        System.out.println("------------------------------------------------");
//        lista.setOrder(new OrderAsc());
//        lista.print();

        Alumno a1 = new Alumno("Juan", "Juarez", 33222444, 18);
        Alumno a2 = new Alumno("Julio", "Cesar", 33222111, 18);

        if (a1.compareTo(a2) < 0){
            System.out.println("Es menor");
        }else if (a1.compareTo(a2) > 0){
            System.out.println("Es mayor");
        }else{
            System.out.println("Son iguales");
        }

    }
}