package Trabajos_Practicos.TP_7;

import java.util.Scanner;

/*
Crea un programa que pida al usuario introducir un número entre 1 y 100. Si el usuario introduce un número fuera de ese
 rango el programa lanzará una excepción propia. El mensaje de la excepción será “El nº está fuera de rango”.
 */

public class EJ_B {

    public static void main(String[] args) {

        Scanner esc = new Scanner(System.in);

        int n;

        try {

            System.out.println("Ingrese un Numero entre 1 y 100: ");
            n = esc.nextInt();
            if (n > 1 && n<100 ){
                System.out.println("Su Numero esta dentro del Rango");
            }
            else{
                System.out.println("Su Numero esta fuera del Rango");
            }

        } catch ( java.util.InputMismatchException e) {// esto es una excepcion propia y especifica de un problema particular

            System.out.print("Usted a Ingresado Letras");
        }

    }
}
