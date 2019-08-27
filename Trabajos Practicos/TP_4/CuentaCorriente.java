package Trabajos_Practicos.TP_4;

import java.util.Scanner;

public class CuentaCorriente {

    private String  nombre_Titular;
    private double  saldo_cuenta;
    private long numero_cuenta;

    public void cargaDatos (){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Nombre de Usuario");
        nombre_Titular = sc.next();
        System.out.println("Ingrese el Saldo de su Cuenta");
        saldo_cuenta = sc.nextInt();

    }

    public CuentaCorriente (String nombre, double saldo){

        this.nombre_Titular = nombre;
        this.numero_cuenta = (long)(Math.random()*100+1);
        this.saldo_cuenta = saldo;


    }

    public void getIngreso (double ingreso){

        if (ingreso >0 ){
            saldo_cuenta += ingreso;
            System.out.println("Operacion Exitosa");
        }
        else{
            System.out.println("Usted Ingreso un Numero Negativo, no es posible realizar la operacion");
        }


    }

    public void getEngreso (double retiro) {

        if (retiro > 0) {
            saldo_cuenta -= retiro;
            System.out.println("Operacion Exitosa");

        } else {
            System.out.println("Usted Ingreso un Numero Negativo, no es posible realizar la operacion");
        }

    }

    public void setSaldo_cuenta (){

        System.out.println("Su saldo es: "+saldo_cuenta);
    }

    public void setIdentidad (){

        System.out.println("\n\n Los datos de Identidad del Usuario, son:");

        System.out.println("Su Nombre es: "+nombre_Titular);
        System.out.println("Su Numero de Cuenta es: "+numero_cuenta);
        System.out.println("Su saldo es: "+saldo_cuenta);
    }

    public void transferencia (int monto_trans){

        if (monto_trans > 0) {
            this.saldo_cuenta -= monto_trans;
            System.out.println("Transferencia  Exitosa");

        } else {
            System.out.println("Usted Ingreso un Numero Negativo, no es posible realizar la operacion");
        }


    }

    public void reseptorTransferencia (int monto_trans){

        if (monto_trans > 0) {
            this.saldo_cuenta += monto_trans;


        } else {
            System.out.println("Usted Ingreso un Numero Negativo, no es posible realizar la operacion");
        }



    }


}
