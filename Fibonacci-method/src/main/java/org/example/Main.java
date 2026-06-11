package org.example;

/**
 * Main application class for the Software Configuration and Testing assignment.
 * This program demonstrates a professional, maintainable structure for a
 * recursive Fibonacci sequence generator.
 */
public class Main {

    public static void main(String[] args) {
        // The assignment requires passing 10 into the Fibonacci method
        int inputNumber = 10;

        // Calculate the result using the static method from our utility class
        long result = FibonacciUtility.getFibonacciTerm(inputNumber);

        // Output descriptive text along with the calculated result
        System.out.println("The " + inputNumber + "th term of the Fibonacci sequence is " + result + ".");
    }
}

/**
 * Utility class to hold mathematical operations.
 * Separating logic from the Main class ensures the project is organized
 * appropriately for future unit testing and development.
 */
class FibonacciUtility {

    /**
     * A recursive static method that returns the nth term in the Fibonacci sequence.
     * * @param n The position in the sequence (0-indexed base cases)
     * @return The nth Fibonacci number
     */
    public static long getFibonacciTerm(int n) {
        // Base case: 0th term is 0, 1st term is 1
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Recursive step: F(n) = F(n-1) + F(n-2)
        return getFibonacciTerm(n - 1) + getFibonacciTerm(n - 2);
    }
}