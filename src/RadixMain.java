import java.util.Scanner;

public class RadixMain {
    public static void main(String[] args) {

        int n = consoleAsk(0,1);
        if (n == 0)
            return;

        int[] arr = new int[n];
        for(int i=0; i < n; i++) {
            arr[i] = consoleAsk(i,0);
        }



//        int[] arr = {16223,898,13,906,235,23,9,1532,6388,14,2511,8};
        arr = RadixSort.radixSort(arr);
        for( int i: arr) {
            System.out.println(i);
        }

    }

    public static int consoleAsk(int i, int step ){
        if (step == 1) {
            System.out.println("Ingrese el tamaño que tendra el array");
        } else {
            System.out.println("Ingrese el valor numero: "+(i+1));
        }
        try {
            Scanner scanner2 = new Scanner(System.in);
            return scanner2.nextInt();
        } catch (Exception err) {
            if (step == 1)
                System.out.println("Ingreso un valor inesperado, se detiene la ejecución");
            else
                System.out.println("Ingreso un valor inesperado, se castea a 0");
            return 0;
        }
    }
}
