package TFI02;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Facultad implements Informacion {


   private String nombre;
   private List<Carrera> coleccionCarrera = new LinkedList<>();

    public Facultad(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCarrera (Carrera carrera){

        this.coleccionCarrera.add(carrera);

    }

    public void eliminarCarrera (Carrera carrera){

        this.coleccionCarrera.remove(carrera);
    }

    public void eliminarEstudiante (Estudiante estudiante){

        for (Carrera carrera : coleccionCarrera ) {

            carrera.eliminarEstudiante(estudiante);



        }
    }

    @Override
    public int verCantidad() {
        int cantidad = coleccionCarrera.size();
        return cantidad;
    }

    @Override
    public String listarContenido() {

        //Yo tengo la idea de que este metodo va a ser llamado dentro de un System.out.println() en un metodo que quiera utilizar para imprimir

        Set<Carrera> carreraOrdenado = new TreeSet<Carrera>();

        //Paso de una lista a otra, porque Treeset ya ordena automaticamente

        for (Carrera carrera : coleccionCarrera ) {

            carreraOrdenado.add(carrera);
        }

        String nombre = "";

        for (Carrera carrera: carreraOrdenado) {

            nombre = carrera.getNombre();

        }

        return nombre  ;
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", coleccionCarrera=" + coleccionCarrera +
                '}';
    }
}
