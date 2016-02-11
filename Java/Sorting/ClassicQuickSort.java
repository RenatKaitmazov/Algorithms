
public class ClassicQuickSort {
  
    private QuickSort() {}

    /********************* HELPER METHODS **********************/
    private static <T extends Comparable> void swap(int i, int j, T[] arr) {
        final T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static <T extends Comparable> void quickSort(T[] arr, int left, int right) {
        if (left >= right) return;

        int i = left, j = right;
        T pivot = arr[left + (right - left) / 2];

        while (j >= i) {
            while (arr[i].compareTo(pivot) < 0) { i++; }
            while (arr[j].compareTo(pivot) > 0) { j--; }
            if (j >= i) swap(i++, j--, arr);
        }

        if (j > left) quickSort(arr, left, j);
        if (i < right) quickSort(arr, i, right);
    }

    /***********************************************************/

    /*********************** INTERFACE *************************/
    public static <T extends Comparable> void quickSort(T[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
}
