package helloworld;

/*
* Access modifiers:
*  - public: accessible from anywhere
*  - private: accessible only within the body of the top-level class that encloses the declaration of the member
*  - protected: accessible within the class and its subclasses
*  - default: accessible within the class and its package
* 
* If not set, then default is used (obviously :D).
*/

class MyClass {

    // data members, with default access modifier
    int a, b;


    /*
    * - if NO constructor is defined, then default constructor (without any parameters) is implicitly defined
    *   and data members are initialized with default values (0, null, etc.)
    * - if at least 1 constructor is defined, then default constructor is NOT implicitly defined
    */

    MyClass() {
        System.out.println("Explicit default constructor");
    }

    MyClass(int a) {
        this.a = a;
    }

    MyClass(int a, int b) {
        this(a);            // Constructor chaining: call another constructor
        this.b = b;
    }

    
    public void setValues(int a) {
        this.a = a;
    }
    
    // Method overloading: same name, different parameters (not return type)
    public void setValues(int a, int b) {
        this.setValues(a); // or this.a = a;
        this.b = b;
    }

    
    int aNonStaticAttribute;
    void aNonStaticMethod() {}
    
    public static void aStaticMethod() {
        // cannot access non-static members from static context, of course.

        // aNonStaticAttribute;
        // aNonStaticMethod();

        /*
        * In Java, static methods use early binding, so:
        *  - don’t need the object to call
        *  - is fixed in the ram
        *  - cannot be overriden
        */
    }
}


public class HelloClass {

    public static void main(String[] args) {

        MyClass obj = new MyClass(5);
        obj.setValues(4, 7);

        /*
         * C++: When declaring, an object is created.
         * Java: When declaring, only a reference is created, which will point to 
         *     the object placed in the heap memory when "new" is called.
         */

        MyClass.aStaticMethod();
    }
    
}

/*
 * Other notes:
 * 
 * Information hiding: at the programming language level, Java has public, private, and protected.
 * 
 * Abstraction: As a process, denotes the extracting of the essential details 
 *     about an item/group of items, while ignoring the inessential details. 
 *     As an entity, denotes a model/other representation for an actual item. 
 *     Easily seen at Design Level:
 *  --- reduce complexity and focus on necessary properties of objects
 * Encapsulation: As a process, encapsulation means the act of enclosing one/more
 *     items within a container. As an entity, refers to a package or a box that 
 *     holds one/more items. Eg: arrays, functions,... As the box can be opaque, 
 *     some information can also be hidden at Implementation Level in order to:
 *  --- ensure simplicity, users don't need to care about implementation details, 
 *          as if just need carry the box while everything is enclosed inside
 *  --- hide important information from irrelevant users -> security.
 * 
 * Note: ignore and hiding are not identical
 * 
 * When use getter & setter:
 *  --- allow access to some useful information
 *  --- flexibility, trigger
 * When not use:
 *  --- if the information is sensitive
 */
