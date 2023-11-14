package helloworld;

// ============================= CONFUSING SCENARIO 1 ==============================

class A {

    A() {
        System.out.println("A says hello");
    }
}

class B extends A {

    B(int dumnyParam) {

        /*
         * !!! ATTENTION
         * 
         * Constructors (are not members) can not be inherited, but can be invoked.
         * Constructor of child class ALWAYS INVOKES constructor of parent as the 1ST command:
         *  --- implicitly if you do not specify (like in this example) and it will use the DEFAULT constructor, or
         *  --- explicitly with super(params) and must be the FIRST statement.
         */

        System.out.println("B says hello");
    }
}

// ============================= CONFUSING SCENARIO 2 ==============================

class C {

    int x = 100;

    public void aMethodThatUseX() {
        System.out.println("This method is using x = " + x);
    }
}

class D extends C {
    int x = 200;

    /*
     * !!! ATTENTION
     * the subclass field x in class D is a separate variable from the superclass field x in class C. 
     * The get_x() method in class C only has access to the field x in C.
     * Calling the aMethodThatUseX() method in class D will print out 100, not 200.
     */
}

// // SOLUTION 

// class C {

//     int x = 100;

//     // declare a getter
//     protected int get_x() {
//         return x;
//     }

//     public void aMethodThatUseX() {
//         System.out.println("This method is using x = " + this.get_x()); // access via getter
//     }
// }

// class D extends C {
//     int x = 200;

//     // Override the get_x() method in class C
//     // Without this decorator, the method still run correctly, it's just more convenient
//     @Override
//     public int get_x() {
//         return x;
//     }
// }

// ============================= CONFUSING SCENARIO 3 ==============================

class E {

    public static void aMethod() {
        System.out.println("Original method.");
    }
}

class F extends E {
    /*
     * !!! ATTENTION
     * Method overriding cannot be applied to static methods.
     * The subclass can declare a static method with the same signature as a static method 
     * in the superclass, but this is called method hiding, not method overriding.
     * 
     * Try uncommenting the @Override decorator and see the error.
     */
    // @Override
    public static void aMethod() {
        System.out.println("This is method hiding, not method overriding.");
    }
}

// ============================== CONFUSING SCENARIO 4 =============================

class G {

    void doA() {
        System.out.println("G do A");
    }
}

class H extends G {

    void doA() {
        System.out.println("H do A");
    }

    void doB() {
        System.out.println("H do B");
    }
}

// =================================================================================

public class HelloInheritance {

    public static void main(String[] args) {

        // Scenario 1

        B b = new B(10);
        // Will print both "A says hello" and "B says hello"

        
        // Scenario 2
        
        D obj3 = new D();
        obj3.aMethodThatUseX();


        // Scenario 3

        E.aMethod();
        F.aMethod();

        // Scenario 4

        G g = new H(); // upcasting
        
        g.doA(); // "H do A" (method of subclass) instead of "G do A"
        // g.doB(); // error, cannot access subclass method

        // H h = (H) new G(); // downcasting, error
        H h = (H) g; // downcasting, no error
        h.doA(); // "H do A"
        h.doB(); // "H do B"
    }
    
}

/*
 * Other notes:
 * 
 * Overriding method
 *  --- means same signature (if diff then it is overloading)
 *  --- CANNOT be more restricted access modifier than that of the parent class.
 *  --- must same return type
 * 
 * 
 * Polymorphism: "same interface, different implementation", different classes may 
 *     contain the same method signature, but the result will be different as the 
 *     code behind (the implementation) is different in each object.
 *     "Polymorphism is the ability to send a message to an object without knowing
 *     what its type (class) is." The most common way to share method signatures 
 *     among multiple classes is to apply inheritance.
 * Inheritance: a mechanism to derive a class from another class for a hierarchy of
 *     classes that share a set of attributes and methods. Main purpose of inheritance
 *     is code reuse.
 * 
 * Code reuse is not necessarily inheritance, it can also be achieved in OTHER ways.
 *     See example below.
 * Note: You do not need inheritance to provide polymorphic methods. All you need is
 * the same method signature => you can define each method manually in each class 
 * without any inheritance
 * 
 * Example of code reuse without inheritance:
 * 
 * class Rectangle {
 *      float height, width;
 *      float area() {...}
 * }
 * 
 * class Window {
 *     Retangle rect; // composition instead of inheritance
 *     
 *     float area() {
 *        return rect.area();
 * }
 */
