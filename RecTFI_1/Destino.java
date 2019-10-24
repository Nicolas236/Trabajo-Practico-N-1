package RecTFI_1;

public class Destino extends Lugares {

    public Destino(String nombre, String direccion) {
        super(nombre, direccion);
    }

    @Override
    public String toString (){
        return "El Nombre del Destino es: "+this.getNombre()+
                "La Direccion de Destino es: "+this.getDireccion();
    }

}
