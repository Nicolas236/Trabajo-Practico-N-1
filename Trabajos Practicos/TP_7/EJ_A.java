package Trabajos_Practicos.TP_7;

import java.util.Scanner;
public class EJ_A {

    /* Crea un programa que pida al usuario introducir un número. El programa debe devolver un mensaje especificando si
    el número introducido por el usuario es par o impar. Además, el programa debe controlar la excepción si el usuario
    introduce texto en lugar de un valor numérico. En caso de introducir texto, se debe advertir al usuario que “El valor
    introducido no es numérico. El programa se cerrará”, terminando la ejecución del programa sin hacer nada más.
 */

        public static void main(String[] args) {

            Scanner esc = new Scanner(System.in);

            int n;

            try {

                System.out.println("Ingrese un Numero: ");
                n = esc.nextInt();
                if (n % 2 == 0){
                    System.out.println("Su numero es Par");
                }
                else {

                    System.out.println("Su numero es Impar");
                }


            } catch ( Exception e) {

                System.out.print("Usted a Ingresado Letras");
            }

        }


}
