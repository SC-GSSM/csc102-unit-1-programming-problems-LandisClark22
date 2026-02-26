package unit1;

public class Unit1 {

    // Main method to test the static methods
    public static void main(String[] args) {

        System.out.println("addIntegers(5, 3): " + addIntegers(5, 3));
        System.out.println("castDoubleToInt(4.7): " + castDoubleToInt(4.7));
        System.out.println("isTrue(true): " + isTrue(true));
        System.out.println("maxValueMinusOne(): " + maxValueMinusOne());
        System.out.println("multiplyIntAndDouble(4, 2.5): " + multiplyIntAndDouble(4, 2.5));
    }

    /**
     * Method 1: Returns the sum of two integers.
     */
    public static int addIntegers(int a, int b) {
        return a + b;
    }

    /**
     * Method 2: Converts a double to an int by casting.
     */
    public static int castDoubleToInt(double value) {
        return (int) value;
    }

    /**
     * Method 3: Checks if a boolean expression is true.
     */
    public static boolean isTrue(boolean value) {
        return value;  
    }

    /**
     * Method 4: Returns the maximum integer value minus one.
     */
    public static int maxValueMinusOne() {
        return Integer.MAX_VALUE - 1;
    }

    /**
     * Method 5: Returns the product of an integer and a double as a double.
     */
    public static double multiplyIntAndDouble(int a, double b) {
        return a * b;
    }
}