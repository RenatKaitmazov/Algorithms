import java.util.Scanner;

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
            int notPrime = numbers[i] * numbers[i] - 2;

            while (notPrime < numbers.length) {
                numbers[notPrime] = 0;
                notPrime += numbers[i];
            }
            while (numbers[i + 1] == 0) i++;
        }

        // Print out all the prime numbers found
        for (int i: numbers) if (i != 0) System.out.format("%d ", i);
    }
}
