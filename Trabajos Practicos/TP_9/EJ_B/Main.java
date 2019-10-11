package Laboratorio.Trabajos_Practicos.TP_9.EJ_B;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Crear_Edificio arreglo [] =new Crear_Edificio[5];

        int i,cantidad,cancha;
        String nombre, deporte;
        double superficie;

        for ( i=0;i<3;i++){

            System.out.println("\tIngrese Polideportivo N°"+(i+1));
            System.out.println("Ingrese el Nombre de su Polideportivo");
            nombre = input.next();
            System.out.println("Ingrese Superficie del edificio");
            superficie = input.nextDouble();
            System.out.println("Numero de Canchas");
            cantidad = input.nextInt();
            System.out.println("Deporte que practica ");
            deporte = input.next();
            System.out.println("En que cancha lo practica");
            cancha =input.nextInt();

            arreglo [i] = new Crear_Edificio(nombre,deporte,cantidad,superficie,cancha);
        }

        for ( i=3;i<5;i++){

            System.out.println("\tIngrese Edificio de Oficina N°"+(i+1));
            System.out.println("Ingrese el Nombre de su Edificio");
            nombre = input.next();
            System.out.println("Ingrese Superficie del edificio");
            superficie = input.nextDouble();
            System.out.println("Numero de Oficinas");
            cantidad = input.nextInt();


            arreglo [i] = new Crear_Edificio(superficie,cantidad,nombre);
        }


        for (i=0;i<5;i++){

            if (i <3){
                System.out.println("*************************************************");
                System.out.println("Polideportivo "+(i+1));
                arreglo [i].verNombre();
                arreglo [i].tipo();
                arreglo[i].edificio();
                arreglo [i].cantidadCanch();
                arreglo [i].deportCadaCancha();
                System.out.println("****************************************************");
            }
           else{
                System.out.println("**********************************************");
                System.out.println("Edificio de oficina");
                arreglo [i].verNombre();
                arreglo [i].tipo();
                arreglo[i].edificio();
                arreglo [i].cantidadOfi();
                System.out.println("*****************************");
            }
        }



    }
}
