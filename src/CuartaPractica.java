import java.util.Scanner;

/**
 * Desarrollar un programa para mostrar por consola los primeros n números primos,
 * siendo n un valor que el usuario ingresará por consola.
 */

public class CuartaPractica {
    public static void main(String[] args) {
        System.out.println("Ingrese un valor para conocer sus n valores primos");
        Scanner scanner2 = new Scanner(System.in);
        int n = scanner2.nextInt();
//        int[] array = new int[];
        for (int i=1;i<n;i++){
            if(esPrimo(i))
                System.out.println(i);
        }

    }

    public static boolean esPrimo(int n){
        if (n<4) {
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
