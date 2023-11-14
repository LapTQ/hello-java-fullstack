package helloworld;

public class HelloStrings {
    
    public static void main(String[] args) {
        
        /*
         * Type of strings:
         * - Immutable: String class, can be created in two ways:
         *  + String literal: using double quotes
         *  + new keyword
         * - Mutable: 
         *  + StringBuffer: synchronized, thread-safe.
         *  + StringBuilder: not synchronized, not thread-safe
         */
        
        String str = "Hello, "; // or ""
        String str2 = new String("World!"); // or null
        /*
         * String literals are stored in a string pool, a special area in the Java heap memory. 
         * When the JVM encounters a string literal, it checks if an equivalent string already exists in the pool. 
         * If it does, the existing string reference is returned instead of creating a new object.
         * 
         * When you create a string using `new`, it always creates a new, separate string object in the heap memory, 
         * regardless of whether an equivalent string already exists in the string pool.
         */
        System.out.println(str + str2);


        StringBuffer strBuffer = new StringBuffer("Hello, ");
        strBuffer.append("LapTQ!");
        System.out.println(strBuffer);
        StringBuilder strBuilder = new StringBuilder("Hello, ");
        /*
         * The synchronization comes with an overhead, making StringBuffer slightly slower in performance compared to StringBuilde.
         * If you have a single-threaded or controlled environment, using StringBuilder is typically faster and more efficient.
         * The methods and functionality of both classes are almost identical, making them interchangeable in most cases.
         */





        /*
         * Methods of the String class:
         * - length(): returns the length of the string
         * - charAt(int index): returns the character at the specified index
         * - concat(String str): concatenates the specified string
         * - contains(CharSequence s): returns true if the string contains the specified sequence of char values
         * - endsWith(String suffix): checks whether the string ends with the specified suffix
         * - equals(Object another): compares this string to the specified object
         * - equalsIgnoreCase(String another): compares this String to another string, ignoring case considerations
         * - indexOf(int ch): returns the index within this string of the first occurrence of the specified character
         * - isEmpty(): checks if the string is empty
         * - lastIndexOf(int ch): returns the index within this string of the last occurrence of the specified character
         * - replace(char old, char new): returns a new string resulting from replacing all occurrences of old in this string with new
         * - replace(CharSequence old, CharSequence new): returns a new string resulting from replacing all occurrences of old in this string with new
         * - replaceAll(String regex, String replacement): replaces each substring of this string that matches the given regular expression with the given replacement
         * - split(String regex): splits this string around matches of the given regular expression
         * - startsWith(String prefix): tests if this string starts with the specified prefix
         * - substring(int beginIndex): returns a new string that is a substring of this string
         * - substring(int beginIndex, int endIndex): returns a new string that is a substring of this string
         * - toCharArray(): converts this string to a new character array
         * - toLowerCase(): converts all of the characters in this String to lower case using the rules of the default locale
         * - toUpperCase(): converts all of the characters in this String to upper case using the rules of the default locale
         * - trim(): returns a copy of the string, with leading and trailing whitespace omitted
         * - valueOf(): returns the string representation of the passed argument
         * - CompareTo(): compares two strings lexicographically
         * - intern(): returns a canonical representation for the string object
         */
    }
}
