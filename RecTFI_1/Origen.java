package RecTFI_1;

public class Origen extends Lugares implements ParaMostrar {

    public Origen(String nombre, String direccion) {
        super(nombre, direccion);
    }

    @Override
    public String toString (){
        return "El Nombre del origen es: "+this.getNombre()+
                "La Direccion de origen es: "+this.getDireccion();
    }
}
