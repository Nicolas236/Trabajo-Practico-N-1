package RecTFI_1;

public class Pasajeros extends Persona implements ParaMostrar {

    public Pasajeros(String nombre, int dni) {

        super(nombre, dni);
    }
    @Override
    public String toString (){
        return "El Nombre del Pasajero es: "+this.getNombre()+
                "El DNI es: "+this.getDNI();
    }
}
