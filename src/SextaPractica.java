import java.util.Scanner;

/**
 * Declara dos variables numéricas (con el valor que desees),
 * muestra por consola la suma, resta,
 * multiplicación, división y módulo (resto de la división).
 */

public class SextaPractica {
    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("ingrese el segundo valor");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        // Resultados
        System.out.println("suma: "+ sum(a,b));
        System.out.println("resta: "+ subtraction(a,b));
        System.out.println("producto: "+ product(a,b));
        if (b != 0)
            System.out.println("div: "+ division(a,b));
        else
            System.out.println("No es posible dividir por 0");

    }
    public static int sum(int a, int b){return a + b;}
    public static int subtraction(int a, int b){return a - b;}
    public static int product(int a, int b){return a * b;}
    public static float division(int a, int b){return (float) a / b;}
}
