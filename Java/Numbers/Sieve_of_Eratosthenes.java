public final class Eratosthenes {

    public static void calculate() {
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter upper bound");
        int upperBound = scanner.nextInt();
        if (upperBound < 2) throw new IllegalArgumentException("Number must be greater than or equal to two");

        // Create an array of numbers from 2 to the upper bound
        int[] numbers = new int[upperBound - 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 2;
        }

        // Find prime numbers
        for (int i = 0; numbers[i] * numbers[i] <= upperBound; i++) {
            int powIndex = numbers[i] * numbers[i] - 2;
            if (numbers[i] == 0) continue;

            int notPrimeIndex = powIndex;

            while (notPrimeIndex < numbers.length) {
                numbers[notPrimeIndex] = 0;
                notPrimeIndex += numbers[i];
            }
        }

        // Print out all the prime numbers found
        for (int i: numbers) if (i != 0) System.out.format("%d ", i);
    }
}
