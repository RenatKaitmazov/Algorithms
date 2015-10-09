public class QuickSort {

    private QuickSort() {}

    /********************* HELPER METHODS **********************/
    private static <T extends Comparable> void swap(int i, int j, T[] arr) {
        final T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static <T extends Comparable> void quickSort(int left, int right, T[] arr) {
        if (left >= right) return;
        if (arr[left].compareTo(arr[right]) > 0) swap(left, right, arr);
        int i = left + 1, k = left + 1, j = right - 1;
        T pivot1 = arr[left], pivot2 = arr[right];

        while (j >= i) {
            if (arr[i].compareTo(pivot1) < 0) {
                if (i != k) swap(i, k, arr);
                k++;
                i++;
            } else if (arr[i].compareTo(pivot2) > 0) {
                if (i != j) swap(i, j, arr);
                j--;
            } else
                i++;
        }
        swap(left, k - 1, arr);
        swap(i, right, arr);

        if (j > left) quickSort(left, k - 1, arr);
        if (j > k) quickSort(k, j, arr);
        if (i < right) quickSort(i + 1, right, arr);
    }

    /***********************************************************/

    /*********************** INTERFACE *************************/
    public static <T extends Comparable> void quickSort(T[] arr) {
        quickSort(0, arr.length - 1, arr);
    }
}
