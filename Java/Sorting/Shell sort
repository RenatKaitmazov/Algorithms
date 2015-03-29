public class ShellSort {
    private ShellSort() {}

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

    /*-------------------------------------------------------*/

    /*********************** INTERFACE *************************/

    public static<T extends Comparable> void shellSort(T[] arr) {
        int pace = arr.length / 2;
        while (pace > 0) {
            for (int i = pace; i < arr.length; i++) {
                T key = arr[i];
                int j = i;
                while (j >= pace && arr[j - pace].compareTo(key) > 0) {
                    arr[j] = arr[j - pace];
                    j -= pace;
                }
                if (j != i)
                    arr[j] = key;
            }

            if (pace == 2)
                pace = 1;
            else
                pace /= 2;
        }
    }
}
