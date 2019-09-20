package Trabajos_Practicos.TP_7;

import java.util.Scanner;

public class EJ_B_ResueltoSegunLaTeoria {


    public static void main(String[] args) {

        pedirDatos();

    }

    static void pedirDatos() throws FueraDeRango{

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un Numero entre 1 y 100");
        int numero = sc.nextInt();

        //excepcion propia

        if (numero < 0 || numero > 100) {

            FueraDeRango miExcepcion = new FueraDeRango("El Numero Ingresado está fuera de rango");
            throw miExcepcion;
        }else {
            System.out.println("EL Numero ingresado es "+numero);
        }
        sc.close();
    }

}

class FueraDeRango extends RuntimeException {

    public FueraDeRango() {

       // System.out.println("Fuera de Rango");
    }

    public FueraDeRango(String mensajeError) {
        super(mensajeError);
    }

}