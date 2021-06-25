import java.util.Scanner;

/**
 * Desarrollar un programa para informar si un número n es primo o no,
 * siendo n un valor que el usuario ingresará por consola.
 * Recordá que un número es primo cuando sólo es divisible por sí
 * mismo y por 1.
 */

public class TerceraPractica {
    public static void main(String[] args) {
        System.out.println("Ingrese un valor para saber si es primo");
        Scanner scanner2 = new Scanner(System.in);
        int n = scanner2.nextInt();
        if (esPrimo(n))
            System.out.println("Es primo");
        else
            System.out.println("no es primo");
    }
    public static boolean esPrimo(int n){
        if ((n == 0 )|| (n == 1) || (n == 4)) {
            return false;
        }
        int mitad = n / 2;
        for (int i = 2; i < mitad; i++) {
            // revisamos el modulo de la mitad de los valores
            if (n % i == 0)
                // si alguno es divisible n no es primo
                return false;
        }
        return true;
    }
}