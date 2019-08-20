package Trabajos_Practicos.TP_3;

public class TP_3_A {
///////////////////////////////////////////////////////// Alumno: Nicolas Martinez ////////////////////////////////////////////////////
/* Ejercicio N°1:
Crear un array de 100 elementos que guarde en cada una de las posiciones un número aleatorio entre 1 y 100.
El programa debe imprimir en consola todos los valores almacenados en el array. Utiliza un bucle for-each para leer los
valores almacenados. (Debes utilizar el método random() de la clase Math para poder rellenar los elementos del array.
BONUS: Verificar que el número no se repita.
 */
    public static void main(String[] args) {

        int [] Arreglo = new int [100];// Formo el arreglo que tiene 100 elementos

        int i,j; // Declaro las variables

        // Cargo el Arreglo
        for (i=0; i<100;i++){

            Arreglo [i] = (int)(Math.random()*100+1);

            //Uso este For con j, para comparar otra posicion del arreglo con la posicion de i
            //Recorro el arreglo buscando los numeros repetidos, si los hay disminuye i para comenzar de vuelta el primer for
            for (j=0; j<100;j++){

                if (Arreglo[i] == Arreglo [j] && i!=j) {

                    i--;


                }

            }
        }


        //Muestro el arreglo

        for (int elemento:Arreglo){

            System.out.print(elemento+" \n");

        }
    }
}
