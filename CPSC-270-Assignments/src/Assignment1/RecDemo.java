package Assignment1;
/**
 * The Class RecDemo.
 * 
 * @author Walker
 * @version 02/05/16
 */
class RecDemo {

    /**
     * Factorial.
     *
     * @param n
     *            the n
     * @return the int
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    /**
     * Fibonacci.
     *
     * @param n
     *            the n
     * @return the int
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * Checks if is pal.
     *
     * @param str
     *            the str
     * @return true, if is pal
     */
    public static boolean isPal(String str) {
        if (str.length() == 1 || str.length() == 0) {
            return true;

        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPal(str.substring(1, str.length() - 1));
        }

        return false;
    }

    /**
     * Mk pal.
     *
     * @param n
     *            the n
     * @return the string
     */
    public static String mkPal(int n) {
        if (n == 0) {
            return "$";
        }
        else {
            return "x" + mkPal(n - 1) + "x";
        }
    }
}
