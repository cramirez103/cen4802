package org.example;

/**
 * Main application class for the Software Configuration and Testing assignment.
 * This program demonstrates a professional, maintainable structure for a
 * recursive Fibonacci sequence generator with an ASCII visualization engine.
 */
public class Main {

    public static void main(String[] args) {
        int inputNumber = 10;

        System.out.println("====================================================");
        System.out.println(">>> DOCKER CONTAINERIZATION ARCHITECTURE SUCCESS <<<");
        System.out.println("====================================================");
        System.out.println("Visualizing Fibonacci Sequence growth up to term " + inputNumber + ":\n");

        // Loop through and build the visual growth bar charts
        for (int i = 0; i <= inputNumber; i++) {
            long termValue = FibonacciUtility.getFibonacciTerm(i);

            // FIXED: Using StringBuilder instead of loop string concatenation '+='
            StringBuilder visualBar = new StringBuilder();
            for (int j = 0; j < termValue; j++) {
                visualBar.append("■");
            }

            // Print formatted index, absolute value, and the visual bar graph
            System.out.printf("Term F(%2d) = %2d | %s\n", i, termValue, visualBar.toString());
        }

        System.out.println("\n====================================================");
        System.out.println(">>> Execution Completed Inside Isolated Container <<<");
        System.out.println("====================================================");
    }

    /**
     * FIXED: Moved inside Main as a 'static' inner class.
     * Separating logic ensures the project is organized appropriately.
     */
    public static class FibonacciUtility {

        /**
         * Calculates the nth term in the Fibonacci sequence using recursion.
         * @param n The position of the term in the Fibonacci sequence (0-indexed).
         * @return The long value of the Fibonacci number at the specified position.
         */
        public static long getFibonacciTerm(int n) {
            // Explicit validation for negative bounds
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
}