package TFI02;

import java.util.*;

public class Materia implements Informacion {

    private  String nombre;
    private String profesor;
    private List<Estudiante> coleccionEstudiante = new LinkedList<>();

    Scanner input = new Scanner(System.in);


    public Materia(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public List<Estudiante> getColeccionEstudiante() {
        return coleccionEstudiante;
    }

    public void agregarEstudiante (Estudiante estudiante){

        coleccionEstudiante.add(estudiante);

    }

    public void eliminarEstudiante (Estudiante estudiante){ // profe lo logre, yo  era el que recontra pregunte

        try{

            System.out.println("Ingrese el nombre del estudiante que desea eliminar");
            String nom = input.next();

            Iterator<Estudiante> it_eliminar = coleccionEstudiante.iterator();


            while (it_eliminar.hasNext()) {// Mientras haya elementos por recorrer

                String nom_est = it_eliminar.next().nombre;//Le estamos diciendo que salte un elemento, y una vez que lo haya hecho, guarda el nombre del cliente

                if (nom_est.equals(nom)){

                    it_eliminar.remove();
                }

            }

        }catch (Exception e) {

            System.out.print("Usted a Ingresado un dato erroneo");
        }




    }

    public void eliminarEstudianteDeUnaMateria (Estudiante estudiante){

        coleccionEstudiante.remove(estudiante);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Materia)) return false;
        Materia materia = (Materia) o;
        return getNombre().equals(materia.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }

    @Override
    public int verCantidad() {
        int cantidad = coleccionEstudiante.size();
        return cantidad;
    }

    @Override
    public String listarContenido() {

        //Yo tengo la idea de que este metodo va a ser llamado dentro de un System.out.println() en un metodo que quiera utilizar para imprimir

        Set<Estudiante> estudianteOrdenado = new TreeSet<Estudiante>();

        //Paso de una lista a otra, porque Treeset ya ordena automaticamente

        for (Estudiante estudiante : coleccionEstudiante ) {

            estudianteOrdenado.add(estudiante);
        }

        String nombre = "";

        for (Estudiante estudiante: estudianteOrdenado) {

            nombre = estudiante.nombre;

        }

        return nombre  ;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", profesor='" + profesor + '\'' +
                ", coleccionEstudiante=" + coleccionEstudiante +
                ", input=" + input +
                '}';
    }
}
