package RecTFI_1;

import java.util.Scanner;

public class Vehiculos extends Automovil implements ParaMostrar {

    Scanner input = new Scanner(System.in);
    private Lugares origen;
    private Lugares destino;
    private Chofer chofer;
    private String matricula;
    private int capacidad;
    private Pasajeros listaPasajeros [];

    public Vehiculos(int capacidad,  String matricula) {
        this.matricula = matricula;
        this.capacidad = capacidad;
    }

    public Lugares getOrigen() {
        return origen;
    }

    public void setOrigen(Lugares origen) {
        this.origen = origen;
    }

    public Lugares getDestino() {
        return destino;
    }

    public void setDestino(Lugares destino) {
        this.destino = destino;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void CargarPasajeros (){

        Pasajeros listaPasajeros [] = new Pasajeros[this.capacidad];

        int i;
        for (i=0; i<this.capacidad;i++){

            System.out.println("Pasajero N°"+(i+1));

            System.out.println("Ingrese el Nombre del pasajero");
            String nombre = input.next();

            System.out.println("Ingrese el DNI del pasajero");
            int DNI = input.nextInt();
            System.out.println(DNI+ "//"+ nombre);
            listaPasajeros [i] = new Pasajeros (nombre,DNI);
        }
    }
    @Override
    public String toString(){
        return "La capacidad del vehiculo es: "+this.capacidad+
                "El Chofer es: "+ this.chofer+
                "El origen es: "+this.origen+
                "El destino es: "+this.destino+
                "La Matricula es: "+this.matricula+
                "Los pasajeros son: "+this.listaPasajeros;
    }

    @Override
    public void verDatos() {

    }

    @Override
    public void setChofer() {

    }

    @Override
    public void setDestino() {

    }

    @Override
    public void setListaPasajeros() {

    }
}
