package pruebagit;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta el primer número:");
        int num1 = sc.nextInt();
        System.out.println("Inserta el segundo número:");
        int num2 = sc.nextInt();
        System.out.println("Escoge una opción:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Resto (módulo)");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println((double) num1 + num2);
                break;
            case 2:
                System.out.println((double) num1 - num2);
                break;
            case 3:
                System.out.println((double) num1 * num2);
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println((double) num1 / num2);
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            case 5:
                if (num2 != 0) {
                    System.out.println("El resto de la división es: " + (num1 % num2));
                } else {
                    System.out.println("No se puede calcular el resto con un divisor igual a cero.");
                }
                break;
            default:
                System.out.println("Esa no es una opción.");
        }
    }
}
