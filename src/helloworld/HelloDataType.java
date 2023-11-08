package helloworld;
import java.util.Date;

public class HelloDataType {
    
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
            stores the actual value of the data, not the address of the data.
        
        */
        
        // by default, the floating decimal is considered as double
        float price = 24.05f;
        char letter = 'A';

        // String, though can be initialized like a primitive data type, is actually non-primitive
        String name = "LapTQ";
        Date now = new Date();
    }
}
