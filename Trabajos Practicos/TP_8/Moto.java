package Trabajos_Practicos.TP_8;

public class Moto implements IVehichulo {


//********************************************** ATRIBUTOS **********************************************************//
    private final String marcaM;
    private int veloMM;
    private int plazaM =2;
    private int numero =0;
//********************************************** CONSTRUCTOR **********************************************************//

    public Moto(String marca, int veloCC, int numero) {
        this.marcaM = marca;
        this.veloMM = veloCC;
        this.plazaM = plazaM -1;
        this.numero = numero;
    }


//********************************************** PROPIEDADES **********************************************************//


    @Override
    public void getMarca() {
        System.out.println("La marca es:"+this.marcaM);

    }

    @Override
    public void getNumero() {
        System.out.println("El numero es: "+this.numero);
    }

    @Override
    public void getVelocidad() {
        System.out.println("La velocidad es:"+this.veloMM);
    }


    public static void getPlazaDis() {

        System.out.println("Las plazas disponibles en Moto son:"+this.plazaM);
    }
//********************************************** METODOS *************************************************************//


    public static void crear( int contM, IVehichulo[] arreglo, String marca, int velocidad) {

        int num_Moto=1;

        arreglo [contM] = new Moto(marca,velocidad, num_Moto);
        num_Moto++;
    }

    public static void getMotos(int indice, IVehichulo arreglo []) {

        for (int i=5;i<indice;i++){

            arreglo[i].getMarca();
            arreglo [i].getNumero();
            arreglo[i].getVelocidad();
            System.out.println("----------------------------------------------");

        }



    }


    @Override
    public void acelerar(int velo_fre) {

        int var= this.veloMM;

        this.veloMM =+ velo_fre;
        if (this.veloMM >120){
            System.out.println("Su velocidad mayor a 120,por eso no aceptamos la modificacion");
            this.veloMM = var;
        }
        else {
            System.out.println("Su velosicad actual es: "+this.veloMM);
        }
    }

    @Override
    public void frenar(int velo_fre) {

        int var= this.veloMM;

        this.veloMM =- velo_fre;
        if (this.veloMM <0){
            System.out.println("Su velocidad es inferior a 0,por eso no aceptamos la modificacion");
            this.veloMM = var;
        }
        else {
            System.out.println("Su velosicad actual es: "+this.veloMM);
        }
    }






}
