package Clases;

import java.util.Scanner;

public class Main {

    //Trabajo Practico N 4: Nicolas Martinez

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cant_cuenta,i, op, temp_cuenta,numero_cliente=0;
        String temp_nom;
        double temp_saldo;
        double monto=0;


        //Se da la bienvenida al Banco, voy a tratar de hacer un arreglo como el que hicimos en clase el Viernes

        System.out.println("Bienvenido al Hombanking");

        //Pregunto la cantidad de cuentas que me va a ingresar, para saber los espacios que va a tener mi arreglo
        //y la cantidad de interasiones del for
        System.out.println("Cuantas cuentas desea Ingresar");
        cant_cuenta = sc.nextInt();


        // Creo el Arreglo del tipo BANCO (la clase)
        Banco  [] Arreglo  = new Banco[cant_cuenta];

        // Pido que me Ingrese las Cuentas y creo el For para eso

        for (i=0;i<cant_cuenta;i++){

            System.out.println("****Ingrese Datos de la cuenta:"+000+i+"****");

            System.out.println("Ingrese su nombre ");
            temp_nom = sc.next();

            System.out.println("Ingrese su saldo");
            temp_saldo = sc.nextDouble();

            temp_cuenta = i;

            // En cada posicion I del arreglo estoy creando un objeto, usando el mismo constructor.
            // Creo que el que hicimos en clase el viernes, era un for parecido

            Arreglo [i] = new Banco (temp_nom,temp_saldo, temp_cuenta);

        }


        do {

            System.out.println("\t\t\tMenu del Hombanking\n\n");

            System.out.println("PRESIONE 1) : Realizar Acreditacion de Dinero");
            System.out.println("PRESIONE 2) : Realizar Debito de su Cuenta");
            System.out.println("PRESIONE 3) : Consultar su Saldo");
            System.out.println("PRESIONE 4) : Consultar Informacion Total");
            System.out.println("PRESIONE 5) : Realizar Transferencia");
            System.out.println("PRESIONE 6) : Mostrar Todas las Cuentas Cargadas");
            System.out.println("PRESIONE 7) : Finalizar Operacion (Salir)");
            op = sc.nextInt();
            if (op > 7 || op < 0){
                System.out.println("Opcion Ingresada Invalida");
            }

            switch (op){

                case 1 :{

                    do {
                        System.out.println("Ingrese el Numero de Cuenta al que quiera acreditar");
                        numero_cliente = sc.nextInt();

                        if (numero_cliente <0 || numero_cliente >= cant_cuenta){

                            System.out.println("Numero de cuenta inexistente, vuelva a ingresar");
                        }

                    }while (numero_cliente <0 || numero_cliente >= cant_cuenta);

                    System.out.println("Ingrese Monto que quiere poner en su cuenta");
                    monto= sc.nextDouble();
                    Arreglo [numero_cliente].setIngreso(monto);

                    break;

                }
                case 2 :{

                    do {
                        System.out.println("Ingrese el Numero de Cuenta ");
                        numero_cliente = sc.nextInt();

                        if (numero_cliente <0 || numero_cliente >= cant_cuenta){

                            System.out.println("Numero de cuenta inexistente, vuelva a ingresar");
                        }

                    }while (numero_cliente <0 || numero_cliente >= cant_cuenta);

                    System.out.println("Ingrese Monto que quiere retirar de su cuenta");
                    monto= sc.nextDouble();

                    Arreglo [numero_cliente].setEgreso(monto);

                    break;
                }
                case 3:{

                    do {
                        System.out.println("Ingrese el Numero de Cuenta ");
                        numero_cliente = sc.nextInt();

                        if (numero_cliente <0 || numero_cliente >= cant_cuenta){

                            System.out.println("Numero de cuenta inexistente, vuelva a ingresar");
                        }

                    }while (numero_cliente <0 || numero_cliente >= cant_cuenta);
                    Arreglo [numero_cliente].getSaldo();
                    break;
                }
                case 4 :{

                    do {
                        System.out.println("Ingrese el Numero de Cuenta ");
                        numero_cliente = sc.nextInt();

                        if (numero_cliente <0 || numero_cliente >= cant_cuenta){

                            System.out.println("Numero de cuenta inexistente, vuelva a ingresar");
                        }

                    }while (numero_cliente <0 || numero_cliente >= cant_cuenta);
                    Arreglo [numero_cliente].getTodaInfo();

                    break;

                }
                case 5:{

                    do {
                        System.out.println("Ingrese el Numero de Cuenta de la cuenta origen ");
                        numero_cliente = sc.nextInt();

                        if (numero_cliente <0 || numero_cliente >= cant_cuenta){

                            System.out.println("Numero de cuenta inexistente, vuelva a ingresar");
                        }

                    }while (numero_cliente <0 || numero_cliente >= cant_cuenta);

                    System.out.println("Ingrese Monto de la Transaccion");
                    monto= sc.nextDouble();
                    Arreglo [numero_cliente].setEgreso(monto);


                    do {
                        System.out.println("Ingrese el Numero de la  Cuenta Receptora  ");
                        numero_cliente = sc.nextInt();

                        if (numero_cliente <0 || numero_cliente >= cant_cuenta){

                            System.out.println("Numero de cuenta inexistente, vuelva a ingresar");
                        }

                    }while (numero_cliente <0 || numero_cliente >= cant_cuenta);
                    Arreglo [numero_cliente].setIngreso(monto);

                    break;

                }
                case 6 :{

                    for (i=0; i < cant_cuenta;i++){

                        Arreglo [i].getTodaInfo();
                        System.out.println("**********************************");
                    }
                    break;
                }



            }

        } while (op != 7);





    }
}
