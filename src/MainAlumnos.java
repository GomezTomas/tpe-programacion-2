import facultad.Alumno;
import list.Node;
import list.OrderedList;

public class MainAlumnos {
    public static void main(String[] args) {
        Alumno martin = new Alumno("Martin", "Gomez", 34111222, 18);
        Alumno jhon = new Alumno("Jhon", "Doe", 12000000, 18);
        Alumno mora = new Alumno("Mora", "Diaz", 37124425, 18);
        Alumno roman = new Alumno("Roman", "Bazan", 32555111, 18);
        Alumno flora = new Alumno("Flora", "Rivas", 34555111, 18);
        Alumno juana = new Alumno("Juana", "Garcia", 27123455, 18);
        Alumno federico = new Alumno("Federico", "Lopez", 35999888, 18);

        OrderedList lista = new OrderedList();

        lista.insertNode(new Node(martin));
        lista.insertNode(new Node(jhon));
        lista.insertNode(new Node(mora));
        lista.insertNode(new Node(roman));
        lista.insertNode(new Node(flora));
        lista.insertNode(new Node(juana));
        lista.insertNode(new Node(federico));

        lista.print();
    }
}
