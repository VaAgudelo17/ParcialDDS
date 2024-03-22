import java.util.Arrays;
import java.util.Scanner;

public class Utilidades {

    /**
     * Metodo para ordenar un arreglo de enteros utilizando el método de la burbuja.
     * 
     * @param array Integer array to be sorted.
     */

    private static void bubbleSort(int[] array) {
		for (int i : array) {
			for (int j : array) {
				if (i > j) {
					int temp = i;
					i = j;
					j = temp;
				}
			}
		}
		}
		
    /**
     * Metodo para ordenar un arreglo de strings utilizando el metodo de la burbuja.
     *
     * @param array String array to be sorted.
     */
    private static void bubbleSort(String[] array) {
		for (String string : array) {
			for (String string2 : array) {
				if (string.compareTo(string2) > 0) {
					String temp = string;
					string = string2;
					string2 = temp;
				}
			}
			
		}   
    }

    /**
     * Metodo para determinar si un numero es primo
     *
     * @param number El numero a verificar
     * @return Verdadero si el numero es primo, falso en caso contrario
     */
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int divisor = 2;
        while (divisor * divisor <= number) {
            if (number % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }
    /**
     * Metodo para calcular el resultado de una operacion.
     *
     * @param a Primer operando
     * @param b Segundo operando
     * @param c Tercer operando
     * @param d Cuarto operando
     * @return El resultado de la operacion
     */
    private static double calculateResult(double a, double b, double c, double d) {
        return ((a + b) * (c - d)) / (a * d);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 9, 23, 4, 55, 100, 1, 1, 23};
        System.out.println("Antes del metodo de la burbuja: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("Después del metodo de la burbuja: " + Arrays.toString(numbers));

        String[] names = {"Leon", "Chris", "Jill", "Wesker", "Ada"};
        System.out.println("Antes del metodo de la burbuja: " + Arrays.toString(names));
        bubbleSort(names);
        System.out.println("Despues del metodo de la burbuja: " + Arrays.toString(names));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la accion que quiere realizar:");

        int action = scanner.nextInt();
        switch (action) {
            case 1:
                System.out.println("Ingrese un numero para saber si es primo o no:");
                int userNumber = scanner.nextInt();
                System.out.println(isPrime(userNumber));
                break;
            case 2:
                System.out.println("Ingrese los 4 numeros double de la operacion:");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
				double c = scanner.nextDouble();
				double d = scanner.nextDouble();
				System.out.println("el resultado es igual a: "+calculateResult(a, b, c, d));
				break;
			default:
				System.out.println("Accion invalida.");
		}
	}
}