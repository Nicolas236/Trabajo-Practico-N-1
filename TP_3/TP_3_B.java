package Trabajos_Practicos.TP_3;

public class TP_3_B {
///////////////////////////////////////////////// Alumno: Nicolas Martinez ///////////////////////////////////////////////////////////////
/* Ejercicio N° 2:
Crear una matriz de 3 x 3 con elementos generados de forma aleatoria por medio del método random() de la clase Math.
Una vez que se genere el array de array mostrar los elementos cargados utilizando la consola.
*/
    public static void main(String[] args) {

        int [] [] Matriz = new int [3] [3];// Formo una Matriz de 3 por 3

        int i,j; // Declaro las variables

        // Cargo la Matriz
        for (i=0; i<3;i++){

            for (j=0; j<3;j++){

                Matriz [i] [j] = (int)(Math.random()*100+1);
            }
        }

       //Muestro la Matriz en el formato de cuadrado

        for (int [] dimension1:Matriz){

            for(int elemento:dimension1){

                System.out.print(elemento+" ");
            }

            System.out.println("");
        }
    }
}
