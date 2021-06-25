import java.util.Scanner;

/**
 * Desarrollar un programa para mostrar los primeros n múltiplos de m,
 * siendo n y m valores que el usuario ingresará por consola.
 * Recordá que un número a es múltiplo de b si a es divisible por b.
 */

public class SegundaPractica {
    public static void main(String[] args) {
        System.out.println("Hola! este programa espera que ingreses 2 numeros por favor, siga los pasos");

        try{
            System.out.println("Ingrese un valor");
            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            System.out.println("Ingrese los la cantidad de multiplos que desea obtener");
            Scanner scanner2 = new Scanner(System.in);
            int n = scanner2.nextInt();

            System.out.print("Los multiplos de " + n + " son");
            int count = 0;

//            for (int i=1;i<n;i++){
//                if ( (esMultiplo(n,i)) && (count<n2) ){
//                    System.out.print(" " + i);
//                    count++;
//                }
//            }

            for(int i=1; i<=n; i++)
            {
                System.out.println(m*i);
            }

        } catch (Exception err) {
            System.out.println("por favor ingrese un numero");
        }


    }

    public static boolean esMultiplo(int numero1,int numero2){
        if (numero1%numero2==0)
            return true;
        else
            return false;
    }
}
