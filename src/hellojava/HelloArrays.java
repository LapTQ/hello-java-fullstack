package hellojava;

public class HelloArrays {
    
    public static void main(String[] args) {
        
        // declare an array
        int[] arr;
        // and allocate memory, can be combined to the previous declaration
        arr = new int[5];  
        
        // OR, declare and initialize at the same time
        // int[] arr = new int[] {1, 2, 3, 4, 5};

        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("age[" + i + "]: " + arr[i]);
        }
        // OR
        for (int value : arr) {
            System.out.println("value: " + value);
        }


        // Multidimensional array
        //int[][] age2 = new int[2][5]; // 2 rows, 5 columns

        // OR
        int[][] arr2 = {
            {1, 2, 3, 4, 5}, 
            {6, 7, 8, 9, 10}
        };
        for (int[] row : arr2) {
            for (int value : row) {
                System.out.println("value: " + value);
            }
        }

        /*
         * Also, variables declared inside a loop or code block are only accessible inside that loop or code block.
         * Try System.out.println(<value or row>) here will result in an error.
         */
    }
}
