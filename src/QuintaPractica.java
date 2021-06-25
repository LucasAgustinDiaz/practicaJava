import java.util.Scanner;

/**
 * Desarrollar un programa para mostrar por consola los primeros n
 * números naturales que tienen al menos m dígitos d, siendo n, m y d
 * valores que el usuario ingresará por consola.
 *
 * Por ejemplo: si el usuario ingresa n=5, m=2 y d=3, el programa
 * deberá mostrar por consola los primeros 5 números naturales
 *
 * que tienen, al menos, 2 dígitos 3. En este caso la salida será:
 * 33, 133, 233, 303, 313.
 * Según cómo decidas encarar la solución de este ejercicio,
 * es probable que necesites utilizar recursos que aún no hemos estudiado.
 * El desafío consiste en googlear cómo utilizar dichos recursos y ¡utilizarlos
 *
 *
 * int numEntero = Integer.parseInt(numCadena);
 */

public class QuintaPractica {
    public static void main(String[] args) {
        // solicitamos valores por consola
        System.out.println("Desarrollar un programa para mostrar por consola los primeros n");
        System.out.println("cuantos numeros quiere buscar?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("cuantos digitos quiere buscar?");
        Scanner scanner2 = new Scanner(System.in);
        int m = scanner2.nextInt();
        System.out.println("ingrese el digito que compondran los resultados");
        Scanner scanner3 = new Scanner(System.in);
        int d = scanner3.nextInt();

        // iniciamos
        int count = 0;
        int value = 0;
        while(n>=count){
            if (findNumber(m,d,value)) {
                count++;
                System.out.println(value);
            }
            value++;
        }

    }

    public static boolean findNumber(int m, int d, int number) {
        // m es la cantidad de veces que debe aparecer d
        int count = 0;
        String[] chairNumber = String.valueOf(number).split(""); // numero a tratar
        String valor = Integer.toString(d); // valor digito a validar
        // m numero de veces que se debe repetir
        for (int x = 0; x < chairNumber.length; x++) {
            if (chairNumber[x].equals(valor))
                count++;
        }
        return (count == m) ? true : false;
    }

//    public static
}

