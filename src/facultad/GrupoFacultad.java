package facultad;

import java.util.ArrayList;

public class GrupoFacultad extends ElementoFacultad{

    private ArrayList<ElementoFacultad> listaElementos;


    public GrupoFacultad(String nombre){
        super(nombre);
        this.listaElementos = new ArrayList<>();
    }



    public void addElemento(ElementoFacultad elementoFacultad){
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
        try{
            return this.nombre.equals(((GrupoFacultad) obj).getNombre());
        }catch (Exception e){
            return false;
        }
    }
}
