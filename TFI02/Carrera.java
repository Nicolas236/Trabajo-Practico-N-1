package TFI02;

import java.util.*;

public class Carrera implements Informacion {

    Scanner input = new Scanner(System.in);

    private String nombre;
    private Set <Materia> coleccionMaterias = new TreeSet<>();

    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria (Materia materia){
        this.coleccionMaterias.add(materia);
    }

    public void eliminarMateria (String nombre){
        this.coleccionMaterias.remove(nombre);

    }



    public void encontrarMateria (String nombre){

        for (Materia  materia: coleccionMaterias ) {

            boolean v = coleccionMaterias.contains(nombre);

            try{

                if (v == true) {
                    System.out.println("La materia si se encuentra");
                    System.out.println("Lo desea eliminar: presione 1");
                    int n = input.nextInt();

                    if (n == 1){
                        coleccionMaterias.remove(nombre);
                        System.out.println("La materia se elimino");
                    }
                    else {
                        System.out.println("La materia no se elimino");
                    }

                } else {
                    System.out.println("El nombre no se encuentra");
                }
            }catch (Exception e) {

                System.out.print("Usted a Ingresado un dato erroneo");
            }



        }

    }

    public void eliminarEstudiante (Estudiante estudiante){

        for (Materia  materia: coleccionMaterias ) {

            materia.eliminarEstudiante(estudiante);

        }


    }

    @Override
    public int verCantidad() {
        int cantidad = coleccionMaterias.size();
        return cantidad;
    }

    @Override
    public String listarContenido() {

        String nombre = "";

        for (Materia materia: coleccionMaterias) {

            nombre = materia.getNombre();

        }

        return nombre  ;
    }


    @Override
    public String toString() {
        return "Carrera{" +
                "input=" + input +
                ", nombre='" + nombre + '\'' +
                ", coleccionMaterias=" + coleccionMaterias +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carrera)) return false;
        Carrera carrera = (Carrera) o;
        return getNombre().equals(carrera.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }
}
