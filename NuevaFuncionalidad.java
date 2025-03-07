package pruebagit;

import java.util.Scanner;

public class NuevaFuncionalidad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta el primer número:");
		double num1=sc.nextInt();
		System.out.println("Inserta el segundo número:");
		double num2=sc.nextInt();
		System.out.println("Escoge una opcion:");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Potencia");
		int opcion=sc.nextInt();
		switch(opcion) {
		case 1:
			System.out.println((double)num1+num2);
			break;
		case 2:
			System.out.println((double)num1+num2);
			break;
		case 3:
			System.out.println((double)num1*num2);
			break;
		case 4:
			System.out.println((double)num1/num2);
			break;
		case 5:
			System.out.println((double)Math.pow(num1,num2));
		default:
			System.out.println("Esa no es una opcion.");
		}
	}

}
