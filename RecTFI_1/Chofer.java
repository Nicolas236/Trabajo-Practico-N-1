package RecTFI_1;

public class Chofer extends Persona implements ParaMostrar {

    public Chofer(String nombre, int DNI) {
        super(nombre, DNI);
    }
    @Override
    public String toString (){
        return "El Nombre del Chofer es: "+this.getNombre()+
                "El DNI del Chofer es: "+this.getDNI();
    }


}
