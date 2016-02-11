public class CocktailSort {
    private CocktailSort() {}

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
        int i = 0, j = arr.length - 1;
        while (j > i) {
            int k;
            for (k = i; k < j; k++)
                if (arr[k].compareTo(arr[k + 1]) > 0)
                    swap(k, k + 1, arr);
            j--;

            for (k = j; k > i; k--)
                if (arr[k].compareTo(arr[k - 1]) < 0)
                    swap(k, k - 1, arr);
            i++;
        }
    }
}
