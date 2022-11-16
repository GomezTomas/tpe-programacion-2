package facultad;

import java.util.ArrayList;

public class GrupoFacultad extends ElementoFacultad {

    private ArrayList<ElementoFacultad> elementos;

    public GrupoFacultad(String nombre){
        this.nombre = nombre;
        elementos = new ArrayList<>();
    }

    public void addElemento(ElementoFacultad elementoFacultad){
        if(!elementos.contains(elementoFacultad)){
            int i = 0;
            while (i<elementos.size() && elementoFacultad.getCantidadAlumnos() > elementos.get(i).getCantidadAlumnos()){
                i++;
            }
            elementos.add(i, elementoFacultad);
        }
    }

    @Override
    public int getCantidadAlumnos() {
        int suma = 0;
        for (ElementoFacultad elem : elementos){
            suma += elem.getCantidadAlumnos();
        }
        return suma;
    }

    public void print(){
        for (ElementoFacultad elem: elementos){
            System.out.println(elem);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for(ElementoFacultad elem: elementos){
            result += "\n" + elem.toString();
        }
        return result;
    }
}
