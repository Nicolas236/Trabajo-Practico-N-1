package Trabajos_Practicos.TP_8;

public class Coche implements IVehichulo {

//********************************************** ATRIBUTOS **********************************************************//
    private  final String marca;
    private int veloCC;
    private int plaza = 5;
    private int numero=0;
//********************************************** CONSTRUCTOR **********************************************************//

    public Coche(String marca, int veloCC, int numero) {
        this.marca = marca;
        this.veloCC = veloCC;
        this.plaza =plaza-1;
        this.numero = numero;

    }

//********************************************** PROPIEDADES **********************************************************//
    @Override
    public void getMarca() {
        System.out.println("La marca es:"+this.marca);
     }

    @Override
    public void getVelocidad() {
        System.out.println("La velocidad es:"+this.veloCC);
    }

    @Override
    public void getPlazaDis() {

        System.out.println("La cantidad de Plazas disponibles para autos son: "+ this.plaza);

    }



    @Override
    public void getNumero() {
        System.out.println("Auto N°"+this.numero);
    }
//********************************************** METODOS *************************************************************//

    public static void crear(int contC, IVehichulo arreglo[], String marca, int velociad) {

        arreglo [contC] = new Coche(marca, velociad, contC);

    }

    public static void getCoche (int indice, IVehichulo arreglo[]){

        for (int i=0; i<indice;i++){
            arreglo [i].getMarca();
            arreglo [i].getNumero();
            arreglo [i].getVelocidad();
            System.out.println("---------------------------------------");

        }
    }


    @Override
    public void frenar(int velo_fre) {
        int var= this.veloCC;

        this.veloCC =- velo_fre;
        if (this.veloCC <0){
            System.out.println("Su velocidad es inferior a 0,por eso no aceptamos la modificacion");
            this.veloCC = var;
        }
        else {
            System.out.println("Su velosicad actual es: "+this.veloCC);
        }

    }

    @Override
    public void acelerar( int velo_fre) {
        int var= this.veloCC;

        this.veloCC =+ velo_fre;
        if (this.veloCC >120){
            System.out.println("Su velocidad mayor a 120,por eso no aceptamos la modificacion");
            this.veloCC = var;
        }
        else {
            System.out.println("Su velosicad actual es: "+this.veloCC);
        }
    }

}
