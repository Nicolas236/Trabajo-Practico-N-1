package RecTFI_1;

public  class Persona {

    private String nombre;
    private int DNI;

    public Persona(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
}
