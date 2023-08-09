public class JavaMathFn {
    public static void main(String[] args) {
        double a = -47.63;
        double b = -894.37;
        double x = 28;
        double y = 4;
        double z = 27;

        // return the maximum of two numbers
        System.out.println("Maximum number of x and y is: " + Math.max(x, y));

        // return the minmum of two numbers
        System.out.println("Minmum number of x and y is: " + Math.min(x, y));

        // return the square root of y
        System.out.println("Square root of y is: " + Math.sqrt(y));

        // returns 28 power of 4 i.e. 28*28*28*28
        System.out.println("Power of x and y is: " + Math.pow(x, y));

        // print the absolute value of double type
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));

        // round up a decimal to the nearest value
        System.out.println(Math.round(a));

        // return the cube root of z
        System.out.println(Math.cbrt(z));
    }
}
