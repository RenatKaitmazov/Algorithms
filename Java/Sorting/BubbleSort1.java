public class BubbleSort1 {
    private BubbleSort1() {}

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
        for (int i = arr.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (arr[j].compareTo(arr[j + 1]) > 0)
                    swap(j, j + 1, arr);
    }
}
