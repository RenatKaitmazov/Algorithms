/**
 * Created by RenatKaitmazov on 24/03/15.
 */
public class BubbleSort2 {
    private BubbleSort() {}

    /********************* HELPER METHODS *********************/
    private static <T> void swap(int i, int j, T[] arr) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static <T extends Comparable> boolean isSorted(T[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i - 1].compareTo(arr[i]) > 0)
                return false;
        return true;
    }

    public static <T> void display(T[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /*-------------------------------------------------------*/

    /*********************** INTERFACE ***********************/
    public static <T extends Comparable> void sort(T[] arr) {
        boolean swapped = true;
        int j = 0;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++)
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    swap(i, i + 1, arr);
                    swapped = true;
                }
        }
    }
}
