public class HeapSort {
    private HeapSort() {}

    /********************* HELPER METHODS *********************/
    private static <T> void swap(int i, int j, T[] arr) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static <T extends Comparable> void display(T[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static <T extends Comparable> boolean isSorted(T[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i - 1].compareTo(arr[i]) > 0)
                return false;
        return true;
    }

    private static <T extends Comparable> void heapify(T[] arr ,int parent, int size) {
        while (2 * parent + 2 <= size) {
            int maxChild = 2 * parent + 1;
            if (maxChild < arr.length && arr[maxChild + 1].compareTo(arr[maxChild]) > 0) maxChild++;
            if (arr[parent].compareTo(arr[maxChild]) < 0) swap(parent, maxChild, arr);
            parent = maxChild;
        }
    }

    /*-------------------------------------------------------*/

    /*********************** INTERFACE *************************/

    public static<T extends Comparable> void heapSort(T[] arr) {
        int size = arr.length - 1;
        for (int i = (size - 1) / 2; i >= 0; i--)
            heapify(arr, i, size);
        while (size > 0) {
            swap(0, size--, arr);
            heapify(arr, 0, size);
        }

    }
}
