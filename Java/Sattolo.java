public final class Sattolo {
    public static <T> T[] cycle(T[] arr) {
        int n = arr.length - 1;

        while (n > 1) {
            // Generate a random number
            int rand = (int) (Math.random() * n);
            
            // Swap values at according indices
            final T temp = arr[rand];
            arr[rand] = arr[n];
            arr[n--] = temp;
        }

        return arr;
    }
}
