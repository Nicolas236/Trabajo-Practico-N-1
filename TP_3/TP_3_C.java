package Trabajos_Practicos.TP_3;
import Clases.Clase_3.Matriz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/////////////////////////////////////////////////////Alumno: Nicolas Martinez////////////////////////////////////////////////////////
/*Ejercicio N°3
Crear una matriz que contenga datos de personas, siendo cada columna una persona diferente y cada fila los datos de las mismas.
Crear una matriz que contenga datos de personas, siendo cada columna una persona diferente y cada fila los datos de las mismas.
 */
public class TP_3_C {

    public static void main(String[] args) {

        String [] [] Personas = new String [3] [2];// Formo una Matriz de 3 por 3
        String []  Nombre = new String [2];
        String []  Aux = new String [3];

        Scanner sc = new Scanner(System.in);
        int i,j = 0,p;

        for (i=0; i<2;i++){

            System.out.println("Datos de la Persona "+(i+1));

            System.out.println("Ingrese el nombre de la Persona");
            Personas [0] [i] = sc.next();

            System.out.println("Ingrese el Numero de Documento");
            Personas [1] [i] = sc.next();

            System.out.println("Ingrese Su Edad");
            Personas [2] [i] = sc.next();
        }

        for (i=0;i<2;i++){

            Nombre [i] = Personas [i] [0];

        }

        Arrays.sort(Nombre);

        for (i=0;i<1;i++){


            for (j=i+1;j<2;j++){

                if (Personas [0] [i].compareTo(Personas [0] [j] ) > 0){

                    for (p=0;p<3;p++){

                        Aux  [p] = Personas [p] [i];
                        Personas [p] [i] = Personas [p] [j];
                        Personas [p] [j] = Aux  [p];

                    }


                }

            }

        }


        for (i=0;i<3;i++){

            for (j=0;j<2;j++){

                System.out.print(Personas [i] [j]+"\t\t");



            }
            System.out.println();

        }




    }


}
