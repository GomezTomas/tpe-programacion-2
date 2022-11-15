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

        System.out.println("Hello world!");

        OrderedList lista = new OrderedList();

        lista.insertNode(new Node(3));
        lista.insertNode(new Node(3));
        lista.insertNode(new Node(1));
        lista.insertNode(new Node(1));
        lista.insertNode(new Node(1));
        lista.insertNode(new Node(1));
        lista.insertNode(new Node(2));
        lista.insertNode(new Node(4));

//        lista.deleteNode(new Node(1));

        lista.print();

        System.out.println("------------------------------------------------");
        lista.setOrder(new OrderDesc());
        lista.print();


        System.out.println("------------------------------------------------");

        lista.setOrder(new OrderAsc());
        lista.print();
        System.out.println("------------------------------------------------");
        lista.setOrder(new OrderAsc());
        lista.print();


    }
}