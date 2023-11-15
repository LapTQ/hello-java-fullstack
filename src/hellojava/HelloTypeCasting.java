package hellojava;

public class HelloTypeCasting {
    
    public static void main(String[] args) {

        /*
         * Implicit (widening):
         *   byte -> short -> int -> long -> float -> double
         * The reverse of it is Explicit (narrowing), and is prone to data loss.
         */

        long medium = 1234;
        double large = medium; // implicit, no error
        byte small = (byte) large; // explicit, must specify casting, unless raise error

        System.out.println("small: " + small);  // return -46
    }
}
