public class QuickSort {

    private QuickSort() {}

    /********************* HELPER METHODS **********************/
    private static <T extends Comparable> void swap(int i, int j, T[] arr) {
        final T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static <T extends Comparable> T median(int left, int right, T[] arr) {
        int mid = left + (right - left) / 2;

        if (arr[left].compareTo(arr[mid]) > 0) swap(left, mid, arr);
        if (arr[left].compareTo(arr[right]) > 0) swap(left, right, arr);
        if (arr[mid].compareTo(arr[right]) > 0) swap(mid, right, arr);

        return arr[mid];
    }

    private static <T extends Comparable> void quickSort(int left, int right, T[] arr) {
        if (left >= right) return;

        int i = left, k = left, j = right;
        T pivot = median(left, right, arr);

        while (j >= i) {
            if (arr[i].compareTo(pivot) < 0) {
                if (i != k) swap(i, k, arr);
                i++;
                k++;
            } else if (arr[i].compareTo(pivot) > 0) {
                if (i != j) swap(i, j, arr);
                j--;
            } else {
                i++;
            }
        }

        if (j > left) quickSort(left, k - 1, arr);
        if (i < right) quickSort(i, right, arr);
    }

    /***********************************************************/

    /*********************** INTERFACE *************************/
    public static <T extends Comparable> void quickSort(T[] arr) {
        quickSort(0, arr.length - 1, arr);
    }
}

