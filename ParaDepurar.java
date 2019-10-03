import java.util.Scanner;

public class ParaDepurar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero,mostrar,var;
        double divisor;
        System.out.println("Ingrese un Numero");

        numero = input.nextInt();





        do {

            System.out.println("Ingrese un numero DECIMAL, emtre 0 y 0,99");
            divisor= input.nextDouble();

        }while (divisor <0 || divisor > 0.99);
        var= (int)divisor;

        mostrar = numero /var;





    }
}
