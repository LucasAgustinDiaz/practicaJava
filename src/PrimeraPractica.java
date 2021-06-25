import java.util.Scanner;

/**
 * Desarrollar un programa para mostrar los primeros n números pares,
 * siendo n un valor que el usuario ingresará por consola.
 * Recordá que un número es par cuando es divisible por 2.
 */

public class PrimeraPractica {

    public static void main(String[] args) {
        System.out.println("Hola! este programa espera que ingreses un numero por favor");

        try{
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (esPar(n)) {
                System.out.println("es par");;
            } else {
                System.out.println("no es par");
            }
        } catch (Exception err) {
            System.out.println("por favor ingrese un numero");
        }

    }

    public static boolean esPar(int n) {
        return n%2 == 0;
    }

}



