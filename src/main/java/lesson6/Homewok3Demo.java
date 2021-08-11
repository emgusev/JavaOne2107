package lesson6;

public class Homewok3Demo {

    public static void main(String[] args) {

        //version
        int[] arr = new int[]{0, 1, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }


        reverseArray();
    }


    //version 2
    public static void reverseArray() {
        int[] arr = new int[]{0, 1, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    //version 3

    /**
     * Меняет в текущем массиве.
     * @param arr
     * @return
     */
    public static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }
}
