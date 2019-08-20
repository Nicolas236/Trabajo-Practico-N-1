package Trabajos_Practicos.TP_3;

import java.util.Scanner;

/////////////////////////////////////////// Alumno:Nicolas Martinez //////////////////////////////////////////////////////////////
/*Ejercicio N°5
Realice un programa que genere una matriz de 3x3 con números ingresados por el usuario por medio de la consola.
Una vez terminada la carga de los elementos se debe mostrar primero la matriz cargada con los datos iniciales y luego
 la matriz con los datos ordenados de mayor a menor.

 */
public class TP_3_E {

    public static void main(String[] args) {


        int[][] Matriz = new int[3][3];// Formo una Matriz de 3 por 3

        int i, j, auxiliar; // Declaro las variables

        Scanner sc = new Scanner(System.in);
        // El Usuario Carga la Matriz
        System.out.println("Ingrese los Numeros de la Matriz:");
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {

                Matriz [i] [j]= sc.nextInt();
            }
        }

        //Muestro la Matriz en el formato de cuadrado

        System.out.println("La Matriz Ingresada es:");
        for (int[] dimension1 : Matriz) {

            for (int elemento : dimension1) {

                System.out.print(elemento + " ");
            }

            System.out.println("");
        }

        //Ordenamiento de la Matriz


        for(i=0; i <3; i++) {
            for (j = 0; j <3; j++) {
                for (int x = 0; x <3; x++) {
                    for (int y = 0; y <3; y++) {
                        if (Matriz[i][j] < Matriz[x][y]) {
                            auxiliar = Matriz[i][j];
                            Matriz[i][j] = Matriz[x][y];
                            Matriz[x][y] = auxiliar;

                        }
                    }
                }
            }
        }

        // Se muestra la matriz ordenada
        System.out.println("La Matriz Ordenada es:");
        for (int[] dimension1 : Matriz) {

            for (int elemento : dimension1) {

                System.out.print(elemento + " ");
            }

            System.out.println("");
        }
    }
}
