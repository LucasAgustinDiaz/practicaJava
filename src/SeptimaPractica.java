import java.util.Scanner;

/**
 * Declara un String que contenga tu nombre, después muestra un
 * mensaje de bienvenida por consola.
 * Por ejemplo: si introduzco “Fernando”,
 * me aparezca “Bienvenido Fernando”.
 */
public class SeptimaPractica {
    public static void main(String[] args) {
        System.out.println("ingrese su nombre");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Bienvenido "+ name);
    }
}
