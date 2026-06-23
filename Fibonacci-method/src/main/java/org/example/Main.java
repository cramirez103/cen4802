package org.example;

/**
 * Main application class for the Software Configuration and Testing assignment.
 * This program demonstrates a professional, maintainable structure for a
 * recursive Fibonacci sequence generator.
 */
public class Main {

    public static void main(String[] args) {
        int inputNumber = 10;

        System.out.println(">>> CI/CD PIPELINE UPGRADE: GENERATING SEQUENCE <<<");
        System.out.print("Fibonacci sequence up to " + inputNumber + " terms: ");

        // SIGNIFICANT CHANGE: Loop through and print the whole sequence dynamically
        for (int i = 0; i <= inputNumber; i++) {
            System.out.print(FibonacciUtility.getFibonacciTerm(i) + " ");
        }
        System.out.println("\n>>> Sequence Generation Complete <<<");
    }
} // Main class completely closed here to fix the language level '8' error

/**
 * Utility class to hold mathematical operations.
 * Separating logic from the Main class ensures the project is organized
 * appropriately for future unit testing and development.
 */
class FibonacciUtility {

    /**
     * Calculates the nth term in the Fibonacci sequence using recursion.
     * @param n The position of the term in the Fibonacci sequence (0-indexed).
     * @return The long value of the Fibonacci number at the specified position.
     */
    public static long getFibonacciTerm(int n) {
        // SIGNIFICANT CHANGE: Explicit validation for negative bounds
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci position cannot be negative.");
        }

        // Base cases
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Recursive step
        return getFibonacciTerm(n - 1) + getFibonacciTerm(n - 2);
    }
}