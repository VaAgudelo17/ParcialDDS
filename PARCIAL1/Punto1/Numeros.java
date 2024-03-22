import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numeros {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int option;
        int number, sum = 0, i;

        System.out.println("Programa que detecta los siguientes tipos de numeros:");
        System.out.println("1. Perfecto");
        System.out.println("2. Defectivo");
        System.out.println("3. Abundante");
        System.out.println("Seleccione su opcion 1, 2 or 3: ");
        input = buffer.readLine();
        option = Integer.parseInt(input);
        System.out.println("-----------------------------------");
        System.out.println("Escriba un numero: ");
        input = buffer.readLine();
        number = Integer.parseInt(input);

        VerificarNumero checker = new VerificarNumero(number);
        String result = "";

        switch (option) {
            case 1:
                result = checker.isPerfect();
                break;
            case 2:
                result = checker.isDefective();
                break;
            case 3:
                result = checker.isAbundant();
                break;
            default:
                result = "Opcion invalida";
        }

        System.out.println(result);
    }
}

class VerificarNumero {
    private int number;

    /**
     * 
     * @param number numero a verificar si es perfecto, defectivo o abundante
     */
    public VerificarNumero(int number) {
        this.number = number;
    }
    /**
     * 
     * @param String con el resultado de la verificacion del numero perfecto 
     * @return  devuelve una cadena que indica si el numero es perfecto o no  lo es 
     */
    
    public String isPerfect() {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return (number == sum) ? "El numero " + number + " es perfecto " : "El numero " + number + " no es perfecto ";
    }

    
    /**
     *  @param String con el resultado de la verificacion del numero defectivo
     * @return devuelve una cadena que indica si el numero es defectivo o no  lo es
     */
    public String isDefective() {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return (number > sum) ? "El numero " + number + " es defectivo " : "El numero " + number + " no es defectivo";
    }
    
    /**
     *  @param String con el resultado de la verificacion del numero abundante
     * @return devuelve una cadena que indica si el numero es abundante o no  lo es
     */
    public String isAbundant() {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return (number < sum * number) ? "El numero " + number + " Es abundante" : "El numero " + number + " No es abundante ";
    }
}