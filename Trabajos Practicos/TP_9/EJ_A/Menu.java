package Laboratorio.Trabajos_Practicos.TP_9;

import java.util.Scanner;

public class Menu {
    public static Scanner input = new Scanner(System.in);






    public static void sw (Numeros_Naturales arreglo [], Numeros_Complejos complejo [], int naturales, int nComplejo){

        System.out.println("Presione 1: Para sumar los numeros Naturales");
        System.out.println("Presione 2: Para Listar los numeros Naturales");
        System.out.println("Presione 3: Para sumar los numeros Complejos ");
        System.out.println("Presione 4: Para listar los numeros Complejos ");
        System.out.println("Presione 0: Para terminar");
        int opcion = input.nextInt();


        do {


            switch (opcion){

                case 1:{
                    System.out.println("Ingrese las dos posiciones del arreglo Natural que quiere sumar");
                    int n1 = input.nextInt();
                    int n2 = input.nextInt();

                    int s1,s2,st;

                    s1= arreglo [n1].suma();
                    s2 = arreglo [n2].suma();
                    st = s1 + s2;

                    System.out.println("La suma de los dos numeros naturales es: "+st);

                    System.out.println("Presione 1: Desea guardar ese valor en el arreglo Natural ");
                    s1 = input.nextInt();

                    if (s1 == 1){
                        System.out.println("Que posicion desea reemplazar (natural)");
                        s2 = input.nextInt();
                        arreglo [s2].setNumero(st);
                        break;
                    }
                    else {
                        System.out.println("Continue con el programa");

                    }
                    break;
                }
                case 2:{
                    Numeros_Naturales.verNumNaturales(naturales, arreglo);

                    break;

                }
                case 3:{

                    System.out.println("Ingrese las dos posiciones del arreglo Complejo que quiere sumar");
                    int n1 = input.nextInt();
                    int n2 = input.nextInt();

                    int s1,s2,st;

                    s1= complejo [n1].suma();
                    s2 = complejo [n2].suma();
                    st = s1 + s2;

                    System.out.println("La suma de los dos numeros complejos es: "+st);

                    System.out.println("Presione 1: Desea guardar ese valor en el arreglo complejo ");
                    s1 = input.nextInt();

                    if (s1 == 1){
                        System.out.println("Que posicion desea reemplazar (complejo)");
                        s2 = input.nextInt();
                        complejo [s2].setNumero(st);
                    }
                    else {
                        System.out.println("Continue con el programa");
                    }

                    break;

                }
                case 4:{
                    Numeros_Complejos.verNumComplejo(nComplejo, complejo);
                    break;
                }
            }

        }while (opcion !=0);

    }
}


