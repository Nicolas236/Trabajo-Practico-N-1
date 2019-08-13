import java.util.Scanner;
///////////////////////////////////////// Alumno:Nicolas Martinez ////////////////////////////////////////////////////////////////
//////////////////////////////////////Trabajo Practico N° 2 (A) ///////////////////////////////////////////////////////////////////
/* Ejercicio A: Almacenar en Array
Desarrollar un programa que pida al usuario que introduzca 10 números enteros por consola.
Los números introducidos se almacenarán en un array. El programa imprime en consola cuántos números negativos,
positivos y valores 0 hay en el array.*/
public class TP_2_A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i,cont_pos=0, cont_neg=0, cont_zero=0;
        int [] arreglo  = new int[10];

        System.out.println("Ingrese los 10 Numeros");

        for (i=0;i<10;i++){

            arreglo [i] = sc.nextInt();

        }

        System.out.println("Los numeros Positivos son:");

        for (i=0;i<10;i++){

            if (arreglo [i] > 0){

                System.out.print(arreglo [i]+ "; ");
                cont_pos++;
            }
        }

        System.out.println("\nLos numeros Negativos son:");

        for (i=0;i<10;i++){

            if (arreglo [i] < 0){

                System.out.print(arreglo [i]+"; ");
                cont_neg++;
            }
            if (arreglo [i] == 0){

                cont_zero++;
            }
        }
        System.out.println("\n");
        System.out.println("La cantidad de numeros Negativos es: "+cont_neg);
        System.out.println("La cantidad de numeros Positivos es: "+cont_pos);
        System.out.println("La cantidad de Zeros es: "+cont_zero);



    }

}