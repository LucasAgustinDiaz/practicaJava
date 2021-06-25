import java.util.Scanner;

/**
 * Haz una aplicación que calcule el área de un círculo(pi*R2).
 * El radio se pedirá por teclado (recuerda pasar de String a
 * double con Double.parseDouble).
 * Usa la constante PI y el método pow de Math.
 */

public class OctavaPractica {
    public static void main(String[] args) {
        System.out.println("Ingrese el radio");
        Scanner scanner = new Scanner(System.in);
        String radio = scanner.next();
//        Double radio = scanner.nextDouble();

        System.out.println("El valor del area es "+ circleArea(Double.parseDouble(radio)));
    }

    private static double circleArea(double radio) {
        return Math.PI * (Math.pow(radio, 2)); // pow calcula potencias pow(base, exponente)
    }

}

