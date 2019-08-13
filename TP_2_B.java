///////////////////////////////////////// Alumno:Nicolas Martinez ////////////////////////////////////////////////////////////////
//////////////////////////////////////Trabajo Practico N° 2 (B) ///////////////////////////////////////////////////////////////////

import java.util.Scanner;

/*
Ejercicio 2. Media en posiciones pares del Array
En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola.
Los números se almacenarán en un array y el programa calculará la media de los números
 introducidos en las posiciones pares del array. (Debes utilizar el operador módulo “%”).
 */
public class TP_2_B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, suma=0, cont=0, promedio=0;
        int [] arreglo = new int[10];

        System.out.println("Ingrese los Numeros");
        for (i=0;i<10;i++){

            arreglo[i] = sc.nextInt();

        }
        for (i=0;i<10;i++){

            if(i%2==0){
                suma += arreglo [i];
                cont++;
            }
        }
        promedio = suma / cont;

        System.out.println("El promedio de las posiciones pares es: "+promedio);
    }
}
