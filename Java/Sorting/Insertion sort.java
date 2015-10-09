public class InsertionSort {
    private InsertionSort() {}

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
        for (int i = 1; i < arr.length; i++) {
            T key = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1].compareTo(key) > 0)
                arr[j] = arr[--j];
            if (j != i)
                arr[j] = key;
        }
    }
}
