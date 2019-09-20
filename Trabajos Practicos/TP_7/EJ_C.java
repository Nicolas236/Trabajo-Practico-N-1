package Trabajos_Practicos.TP_7;

import java.util.Scanner;
/*
Crea un programa que pida al usuario introducir un número. El programa debe devolver un mensaje especificando si el número
introducido por el usuario es par o impar. Además, el programa debe controlar la excepción si el usuario introduce texto en
lugar de un valor numérico y debe pedir que ingrese nuevamente el número. Esta acción se repetirá hasta que el usuario ingrese
un número. El programa se cerrará”, terminando la ejecución del programa sin hacer nada más.
 */
public class EJ_C {

    public static void main(String[] args) {

        int n;
        boolean var = false;

        do {
            Scanner sc = new Scanner(System.in);
            //Al comienzo me daba un bucle infinito, pero despues el profe dijo que era porque el escanner estaba fuera del do

            try {

                System.out.println("\n Ingrese un Numero: ");
                n = sc.nextInt();

                if (n % 2 == 0){
                    System.out.println("Su numero es Par");
                }
                else {

                    System.out.println("Su numero es Impar");
                }
                var=true;

            } catch ( Exception e) {

                System.out.print("Usted a Ingresado Letras");


            }
        }while (!var);



    }
}
