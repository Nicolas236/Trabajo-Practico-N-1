package Trabajos_Practicos.TP_8;

import java.util.Scanner;

public class Menu {

    public static Scanner input = new Scanner(System.in);

    public static int pantalla (){
        int opcion;


        System.out.println("Presione 1: Crear auto"+
                           "\nPresione 2: Crear Moto"+
                           "\nPresione 3: Mostrar autos y motos creados"+
                           "\nPresione 4: Frenar"+
                           "\nPresione 5: acelerar"+
                           "\nPresione 6: Para saber las Plazas disponibles"+
                           "\nPresione 0: Para salir");
        opcion = input.nextInt();


        return opcion;
    }
}
