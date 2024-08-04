// Calculator.java
/**
 * A simple calculator class to perform basic arithmetic operations.
 */
public class calculator {

    /**
     * Adds two integers.
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first integer.
     * @param a the first integer
     * @param b the second integer
     * @return the difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second integer.
     * @param a the first integer
     * @param b the second integer
     * @return the quotient of a and b
     * @throws IllegalArgumentException if b is zero
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public double power(int a, int b) {
        return Math.pow(a, b);
    }
    public static void main(String[] args) {
        calculator calculator = new calculator();

        // Sample usage of Calculator class
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        System.out.println("Division: " + calculator.divide(5, 3));
        System.out.println("Modulus: " + calculator.modulus(5, 3));
        System.out.println("Power: " + calculator.power(5, 3));

    }
}
