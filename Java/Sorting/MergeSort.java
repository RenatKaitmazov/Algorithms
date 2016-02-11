public class MergeSort {
    private MergeSort() {}

    /********************* Helper methods *****************************/
    private static void swap(int i , int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1])
                return false;
        return true;
    }

    private static void merge(int[] arr, int[] aux, int leftIndex, int midIndex, int rightIndex) {
        for (int i = 0; i < arr.length; i++)
            aux[i] = arr[i];

        int i = leftIndex, j = midIndex + 1;
        for (int k = leftIndex; k <= rightIndex; k++) {
            if (i > midIndex)
                arr[k] = aux[j++];
            else if (j > rightIndex)
                arr[k] = aux[i++];
            else if (aux[j] < aux[i])
                arr[k] = aux[j++];
            else
                arr[k] = aux[i++];
        }
    }

    private static void sort(int[] arr, int[] aux, int leftIndex, int rightIndex) {
        if (leftIndex == rightIndex) return;
        int mid = leftIndex + (rightIndex - leftIndex) / 2;
        sort(arr, aux, leftIndex, mid);
        sort(arr, aux, mid + 1, rightIndex);
        merge(arr, aux, leftIndex, mid, rightIndex);
    }
    ////////////////////////////////////////////////////////////////////

    /********************* Interface **********************************/
    public static void sort(int[] arr) {
        int[] aux = new int[arr.length];
        sort(arr, aux, 0, arr.length - 1);
    }

    public static void display(int[] arr) {
        for (int i: arr)
            System.out.printf("%d ", i);
        System.out.println();
    }
    ////////////////////////////////////////////////////////////////////
}
