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

    private static <T extends Comparable> void insertionSort(int left, int right, T[] arr) {
        for (int i = left + 1; i <= right; i++) {
            T key = arr[i];
            int j = i;

            while (j > left && arr[j - 1].compareTo(key) > 0)
                arr[j] = arr[--j];

            if (j != i) arr[j] = key;
        }
    }

    private static <T extends Comparable> void quickSort(int left, int right, T[] arr) {
        if (left >= right) return;
        if (right - left <= 10) insertionSort(left, right, arr);

        int i = left + 1, j = right - 1;
        T pivot = median(left, right, arr);

        while (j >= i) {
            while (arr[i].compareTo(pivot) < 0) { i++; }
            while (arr[j].compareTo(pivot) > 0) { j--; }
            if (j >= i) swap(i++, j--, arr);
        }

        if (j > left) quickSort(left, j, arr);
        if (i < right) quickSort(i, right, arr);
    }

    /***********************************************************/

    /*********************** INTERFACE *************************/
    public static <T extends Comparable> void quickSort(T[] arr) {
        quickSort(0, arr.length - 1, arr);
    }
}
