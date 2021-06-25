import java.util.Scanner;

/**
 *Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
 *  Si no lo es, también debemos indicarlo.
 */

public class NovenaPractica {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("2" == "2");

        if(isDivFor2(n))
            System.out.println("Es divisible por 2");
        else
            System.out.println("No es divisible por 2");
    }

    public static boolean isDivFor2(int n) {
        return (n%2 == 0) ? true : false;
    }
}
