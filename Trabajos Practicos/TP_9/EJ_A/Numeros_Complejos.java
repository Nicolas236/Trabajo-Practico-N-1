package Laboratorio.Trabajos_Practicos.TP_9;

import java.util.Arrays;
import java.util.Scanner;

public class Numeros_Complejos implements IMetodos {

    private int numero_com;

    Numeros_Complejos (int numero){
        this.numero_com =numero;
    }

    @Override
    public void getNumero() {

        System.out.print(this.numero_com+",");

    }

    @Override
    public void setNumero(int numero) {

        this.numero_com = numero;
    }

    public static void creacionComplejo ( Numeros_Complejos complejo [], int complejos){
        int numero;
        for (int i=0;i<complejos;i++){


            numero = Numeros_Complejos.ControlDeErrorCom();

            complejo [i] = new Numeros_Complejos(numero);


        }
    }

    public  int suma (){

        int  num;

        num   = this.numero_com;
        return num;
    }

    public static void verNumComplejo (int complej, Numeros_Complejos complejo []){
        int i;

        Arrays.sort(complejo);

        for (i=0;i<complej;i++){

            complejo [i].getNumero();

        }

    }

    public static int ControlDeErrorCom (){

        Scanner input = new Scanner(System.in);
        int numero =0;


        try{
            System.out.println("Ingrese numeros Complejos para su arreglo");
            numero =input.nextInt();

        }catch (Exception e){
            System.out.println("No ha ingresado un numero, vuelva a intentar");
            ControlDeErrorCom();
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


