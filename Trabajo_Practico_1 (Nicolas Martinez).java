import java.util.Scanner;

/// Alumno: Nicolas Martinez
public class Trabajo_Practico_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
         
		int edad;
		
		do {
			System.out.println("Ingrese su edad");
			edad = sc.nextInt();
			
			if (edad >= 18) {
				System.out.println("Usted es Mayor de edad");
			}
			else {
				System.out.println("Usted es Menor de edad");
			}
		} while (edad!=0);
		
	}

}
