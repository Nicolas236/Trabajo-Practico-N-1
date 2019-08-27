package Trabajos_Practicos.TP_4;

import Clases.Clase_5.CuentaCorriente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre_Titular;
        double saldo_cuenta, ingreso,retiro;
        int opcion, monto_trans;


        System.out.println("Ingrese el Nombre de Usuario");
        nombre_Titular = sc.next();
        System.out.println("Ingrese el Saldo de su Cuenta");
        saldo_cuenta = sc.nextDouble();

        //Aca creo el objeto
        CuentaCorriente CuentaCorriente1 = new CuentaCorriente (nombre_Titular,saldo_cuenta);

        System.out.println("************************* Menu************************************\n");

        System.out.println("Opcion 1) Si desea ACREDITAR dinero, Presione 1");
        System.out.println("Opcion 2) Si desea RETIRAR dinero, Presione 2");
        System.out.println("Opcion 3) Si desea VER el SALDO de su cuenta, Presione 3");
        System.out.println("Opcion 4) Si desea VER los datos de su Identidad, Presione 4");
        System.out.println("Opcion 5) Si desea REALIZAR TRANSFERENCIAS, Presione 5");
        opcion = sc.nextInt();

        switch (opcion){

            case 1: {

                // Ingresa Dinero a su Cuenta
                System.out.println("Cuanto dinero desea Acreditar a su cuenta");
                ingreso = sc.nextDouble();
                CuentaCorriente1.getIngreso(ingreso);
                break;
            }
            case 2: {
                // Retira dinero de su Cuenta

                System.out.println("Cuanto dinero desea Rtirar de su cuenta");
                retiro = sc.nextDouble();
                CuentaCorriente1.getEngreso(retiro);
                break;
            }
            case 3: {
                //Muestra el saldo de la cuenta
                CuentaCorriente1.setSaldo_cuenta();
                break;
            }
            case 4: {
                //Muestra los datos del Usuario
                CuentaCorriente1.setIdentidad();
                break;
            }
            case 5: {

                System.out.println("Ingrese el Usuario al que desea Transferir");

                System.out.println("Ingrese el Nombre de Usuario");
                nombre_Titular = sc.next();
                System.out.println("Ingrese el Saldo de su Cuenta");
                saldo_cuenta = sc.nextDouble();

                //Aca creo el objeto
                CuentaCorriente  cuentaCorriente2 = new CuentaCorriente (nombre_Titular,saldo_cuenta);

                System.out.println("Ingrese el Monto que desea transferir");
                monto_trans =sc.nextInt();
                CuentaCorriente1.transferencia(monto_trans);
                cuentaCorriente2.reseptorTransferencia(monto_trans);

                System.out.println("\n\n");

                System.out.println("Despues de la Transferencia su Saldo es:");
                CuentaCorriente1.setSaldo_cuenta();

                System.out.println("Despues de la Transferencia el Saldo a la cuenta transferida es:");
                cuentaCorriente2.setSaldo_cuenta();
                break;


            }
        }
    }
}

