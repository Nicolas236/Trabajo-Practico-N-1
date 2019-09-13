package TP_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Ingrese la cantidad de contraseñas que quiera crear: ");
        int cantidad = input.nextInt();
        System.out.print("Ingrese la longitud de su contraseña: ");
        int longitud =input.nextInt();
        CrearContraseñas[] password = new CrearContraseñas[cantidad];       //Se crea un arreglo de objetos.


        for(int i = 0 ; i < cantidad ; i++) {
            password[i] = new CrearContraseñas(longitud);
        }


        System.out.println( "\nContraseñas\tlongitud\tseguro o no seguro" +
                            "\n-----------------------------------------");
        for (int i=0;   i<cantidad; i++){
            if (password[i].getSeguro()){       //Se verifica si el password es o no seguro.
                System.out.println(password[i].getContraseña() + "\t\t" + password[i].getlargoCont() + "\t\tSegura");
            }else   System.out.println(password[i].getContraseña() + "\t\t" + password[i].getlargoCont() + "\t\tNo Segura");

        }

    }

}
