package Laboratorio.Trabajos_Practicos.TP_9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cantidad=4, naturales, complejos;

        System.out.println("Ingrese la cantidad de numeros naturales a agrear ");
        naturales = input.nextInt();
        System.out.println("Ingrese la cantidad de numeros complejos a agrear ");
        complejos = input.nextInt();

        cantidad = naturales + complejos;

        Numeros_Naturales arreglo [] = new Numeros_Naturales [naturales];
        Numeros_Complejos complejo [] = new Numeros_Complejos [complejos];


       Numeros_Naturales.CreacionNaturales(naturales,arreglo);
       Numeros_Complejos.creacionComplejo(complejo,complejos);


        Menu.sw( arreglo,complejo, naturales, complejos);







    }
}
