package Laboratorio.Trabajos_Practicos.TP_9.EJ_B;

public class Crear_Edificio implements IPolide, IOfici {


    private String nombre;
    private String deporPrac;
    private String tipo ;
    private double superficie;
    private int cantidad;
    private int cancha;


    Crear_Edificio(String nombre, String deporPrac, int cantidad, double superficie, int cancha){

       this.nombre = nombre;
       this.deporPrac = deporPrac;
       this.cantidad = cantidad;
       this.superficie = superficie;
       this.cancha = cancha;
       this.tipo = "Polideportivo";

    }

    Crear_Edificio (double superficieOO, int cantidadO, String nombre ){
        this.tipo = "Oficinas";
        this.nombre = nombre;
        this.superficie = superficieOO;
        this.cantidad = cantidadO;
    }

    @Override
    public void tipo() {

        System.out.println("Es un: "+this.tipo);
    }

    @Override
    public void edificio() {

        System.out.println("La superficie del edificio es: "+ this.superficie);

    }

    @Override
    public void verNombre() {

        System.out.println("El nombre es: "+ this.nombre);

    }

    @Override
    public void cantidadCanch() {

        System.out.println("La cantidad de canchas son: "+ this.cantidad);
    }

    @Override
    public void deportCadaCancha() {

        System.out.println("En la cancha "+this.cancha+" se juega: "+ this.deporPrac);
    }


    @Override
    public void cantidadOfi() {

        System.out.println(" La cantidad de oficinas son "+ this.cantidad);
    }
}
