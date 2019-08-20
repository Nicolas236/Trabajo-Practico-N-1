package Trabajos_Practicos.TP_3;
import java.util.Arrays;
/////////////////////////////////////////////////Alumno: Nicolas Martinez /////////////////////////////////////////////////////////////
/*Ejercicio N°4
Realice un programa que genere una matriz de 3x3 con números al azar y la muestra utilizando la consola.
Una vez que muestre la matriz desordenada, debe mostrar también la matriz ordenada de menor a mayor
 */
public class TP_3_D {

    public static void main(String[] args) {

        int[][] Matriz = new int[3][3];// Formo una Matriz de 3 por 3

        int i, j, auxiliar; // Declaro las variables

        // Cargo la Matriz
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {

                Matriz[i][j] = (int) (Math.random() * 100 + 1);
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

        System.out.println("La Matriz Ordenada es:");
        for (int[] dimension1 : Matriz) {

            for (int elemento : dimension1) {

                System.out.print(elemento + " ");
            }

            System.out.println("");
        }

    }

}
