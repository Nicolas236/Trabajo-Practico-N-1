package Laboratorio.Trabajos_Practicos.TP_9;

import java.util.Arrays;
import java.util.Scanner;

public class Numeros_Naturales implements IMetodos {

    private int numero;

    Numeros_Naturales (int numero){
        this.numero= numero;
    }

    @Override
    public void getNumero() {

        System.out.print   (this.numero+",");
    }

    @Override
    public void setNumero(int numero) {
        this.numero = numero;

    }


    public  static void CreacionNaturales (int naturales, Numeros_Naturales arreglo []){

        for (int i=0;i<naturales;i++){

            int numero;
            numero = Numeros_Naturales.ControlDeErrorNatu();

            arreglo [i] = new Numeros_Naturales (numero);


        }

    }

    public static void verNumNaturales (int naturales, Numeros_Naturales arreglo []){
        int i;

        //Arrays.sort(arreglo);

        for (i=0;i<naturales;i++){

            arreglo [i].getNumero();

        }

    }

    public  int suma (){

       int  num;

        num   = this.numero;
        return num;
    }

    public static int ControlDeErrorNatu (){

        Scanner input = new Scanner(System.in);
        int numero =0;


        try{
            System.out.println("Ingrese numeros Naturales para su arreglo");
            numero =input.nextInt();

        }catch (Exception e){
            System.out.println("No ha ingresado un numero, vuelva a intentar");
            ControlDeErrorNatu();
        }
        return numero;
    }

    @Override
    public int multiplicacion() {
        return 0;
    }

    @Override
    public int resta() {
        return 0;
    }
}
