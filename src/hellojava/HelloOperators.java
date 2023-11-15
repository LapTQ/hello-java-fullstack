package hellojava;

public class HelloOperators {
    
    public static void main(String[] args) {

        /*
         * Types of operators:
         * - Arithmetic: +, -, *, /, %, ++, --
         * - Relational: ==, !=, >, <, >=, <=
         * - Logical: &&, ||, !
         * - Bitwise: &, |, ^, ~, <<, >>, >>>
         * - Assignment: =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=
         */

        int a = 100;

        System.out.println("a++: " + a++); // use before increment
        System.out.println("++a: " + ++a); // increment before use

        // Terinary operator
        a = (2 > 3) ? 2 : 3;
    }
}
