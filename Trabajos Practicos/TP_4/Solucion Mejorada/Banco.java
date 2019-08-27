package Clases;

import java.util.Scanner;
//Trabajo Practico N 4: Nicolas Martinez
// Profe creo que cumple con la sinsigna igual, hice de dos formas
public class Banco {


    private long cuenta;
    private  double saldo;
    private String nombre;

    Scanner sc = new Scanner(System.in);

    public Banco (String nombre, double saldo,int cuenta){


        this.nombre = nombre;
        this.saldo = saldo;
        this.cuenta = cuenta;

    }

    public void getSaldo() {

        System.out.println("Su saldo es:"+ saldo);
    }

    public void getCuenta() {

        System.out.println("Su Cuenta es:"+ cuenta);
    }

    public void getTodaInfo (){

        System.out.println("Su Nombre es: "+nombre);
        System.out.println("Su Numero de Cuenta es: "+cuenta);
        System.out.println("Su Saldo es: "+saldo);
    }

    public void setIngreso (double monto){


        saldo += monto;
    }

    public void setEgreso (double monto){


        saldo -= monto;
    }



}
