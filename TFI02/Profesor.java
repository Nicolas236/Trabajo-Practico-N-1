package TFI02;

public class Profesor extends Persona {

    private double basico ;
    private int antiguedad;

    public Profesor(String nombre, String apellido,  double basico, int antiguedad) {
        super(nombre, apellido);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    public double calcularSueldo (){
       double diezpor =  10 * basico / 100;
       double por = diezpor * antiguedad;
       double sueldo = por + basico;
        return sueldo  ;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "basico=" + basico +
                ", antiguedad=" + antiguedad +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                '}';
    }
}
