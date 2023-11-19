package hellojava;
import java.util.Date;

public class HelloDataTypes {
    
    public static void main(String[] args) {

        /* Primitive vs Reference (non-primitive) data types:
        
            Primitive data types:
                - byte: 1 byte
                - short: 2 bytes
                - int: 4 bytes
                - long: 8 bytes
                - float: 4 bytes
                - double: 8 bytes
                - boolean: 1 byte
                - char: 2 bytes
            Properties:
                - stores the actual value of the data, not the address of the data.
                - is written directly in Stack memory.

            Reference data types:
                - Value stored in Stack memory is used as a reference pointer to Heap memory.
                    So in function arguments, java pass: value for primitive & reference for object => for object, == check if same reference (i.e same object)
        
        */
        
        // by default, the floating decimal is considered as double
        float price = 24.05f;
        char letter = 'A';

        // String, though can be initialized like a primitive data type, is actually non-primitive
        String name = "LapTQ";
        Date now = new Date();
    }
}
