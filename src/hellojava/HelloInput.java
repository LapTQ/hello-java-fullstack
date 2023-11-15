package hellojava;
import java.util.Scanner;

public class HelloInput {
    
    public static void main(String[] args) {
        
        /* Scanner class extends the java.lang.Objects class

            It implements Iterator and Closeable interfaces.
            It parses primitive types and strings using regular expressions.
        */

        Scanner scanner = new Scanner(System.in);
        String name;

        // Try inputing 'Tran Quoc Lap' ...
        System.out.print("Enter your name: ");
        name = scanner.next();
        System.out.println("Hello, " + name + "!");

        // ... and see the difference between next() and nextLine()!!!
        System.out.print("Enter your name (again): ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        System.out.println("The first character entered: " + letter);

        scanner.close();

        /*
         * Methods of the Scanner class:
         *  - next(): returns the next token of input
         *  - nextLine(): advances this scanner past the current line and returns the input that was skipped
         *  - nextInt(): scans the next token of the input as an int
         *  - nextDouble(): scans the next token of the input as a double
         *  - close(): closes this scanner
         */

    }
}
