
import java.util.ArrayList;


public class RadixSort {

    public RadixSort() {
    }

    /**
     * Realiza el ordenamiento natural
     * @param arr int[]
     * @return
     */
    public static int[] radixSort(int []arr) {
        String[] newArray = arrayNumToString(arr); // transformamos int[] a String[]
        int count = newArray[0].length()-1; // rescatamos la maxima longitud ya que todos los elementos tienen la misma longitud

        while (count >= 0) {
            newArray = iteration(newArray,count);
            count--;
        }
        // volvemos a convertir String[] a int[]
        int[] lastArray = new int[newArray.length];
        for (int i=0; i < newArray.length; i++){
            lastArray[i] = Integer.parseInt(newArray[i]);
        }
        return lastArray;
    }

    /**
     * funcion - convertir de int[] en String[]
     * @param arr int[]
     * @return
     */
    private static String[] arrayNumToString(int arr[]){
        String[] newArray = new String[arr.length];
        int[] arrForSort = arr;
        int maxLong = maxLongInArray(arrForSort); // obtenemos la longitud maxima del mayor elemento del array
        for(int i = 0; i< arr.length; i++){
            String castedWord = String.valueOf(arr[i]);
            newArray[i] = addCeroToValue(castedWord, maxLong); // añadimos los 0

        }
        return newArray;
    }

    /**
     *  Funcion que obtiene el mayor elemento de un int[]
     * @param arr int[]
     * @return int
     */
    private static int maxLongInArray(int arr[]) {
//        Arrays.sort(arr);
//        int maxValue = arr[arr.length-1];
        int maxValue = -1;
        for (int i:arr) {
            if (maxValue < i) {
                maxValue = i;
            }
        }
        return String.valueOf(maxValue).length();
    }

    /**
     * Funcion que recibe un elemento String y retorna un string con 0 a la izquierda
     * @param el String
     * @param limit int // con esto determinamos el numero de 0 que se agregan
     * @return
     */
    private static String addCeroToValue(String el, int limit) { //agergamos 0 hasta el limite
        String ceros = "";
        int dif = limit - el.length();
        while (ceros.length() < dif) {
            ceros += "0";
        }
        return ceros+ el;
    }

    /**
     *  funcion que trabaja con las listas del 1 al 10 solicitado
     * @param arr
     * @param index
     * @return
     */
    private static String[] iteration(String[] arr, int index) {
        // listas iniciadas
        ArrayList<String> l0= new ArrayList<>();
        ArrayList<String> l1= new ArrayList<>();
        ArrayList<String> l2= new ArrayList<>();
        ArrayList<String> l3= new ArrayList<>();
        ArrayList<String> l4= new ArrayList<>();
        ArrayList<String> l5= new ArrayList<>();
        ArrayList<String> l6= new ArrayList<>();
        ArrayList<String> l7= new ArrayList<>();
        ArrayList<String> l8= new ArrayList<>();
        ArrayList<String> l9= new ArrayList<>();
        // iteracion
        for (String el: arr) {
            // separamos la plabra
            String value = el.split("")[index];

            switch (Integer.parseInt(value)) {
                case 0:
                    l0.add(el);
                    break;
                case 1:
                    l1.add(el);
                    break;
                case 2:
                    l2.add(el);
                    break;
                case 3:
                    l3.add(el);
                    break;
                case 4:
                    l4.add(el);
                    break;
                case 5:
                    l5.add(el);
                    break;
                case 6:
                    l6.add(el);
                    break;
                case 7:
                    l7.add(el);
                    break;
                case 8:
                    l8.add(el);
                    break;
                case 9:
                    l9.add(el);
                    break;
            }

        }
        // mejorar concatenacion
        ArrayList<String> concatedList = new ArrayList<>();
        concatedList.addAll(l0);
        concatedList.addAll(l1);
        concatedList.addAll(l2);
        concatedList.addAll(l3);
        concatedList.addAll(l4);
        concatedList.addAll(l5);
        concatedList.addAll(l6);
        concatedList.addAll(l7);
        concatedList.addAll(l8);
        concatedList.addAll(l9);

        // Convert ArrayList to Array
        // String[] array = concatedList.toArray(new String[0]);
        return concatedList.toArray(new String[0]);
    }
}
// (Object) arrayNumToString(arr)[0].getClass().getSimpleName() conocer el tipo de datos

//    public static void main(String[] args) {
//
////
////        int[] arr = {16223,898,13,906,235,23,9,1532,6388,2511,8};
////        arr = radixSort(arr);
////        for( int i: arr) {
////            System.out.println(i);
////        }
//
//    }