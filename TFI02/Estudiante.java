package TFI02;

public class Estudiante extends Persona {


    public Estudiante(String nombre, String apellido) {
        super(nombre, apellido);

    }



    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +

                '}';
    }


}
