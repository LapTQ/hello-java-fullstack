package hellojava;

abstract class AnAbstractClass {
    abstract void doA();
}

interface InterfaceX {

    /* 
     * all the members are public implicitly
     * all the attributes are static, final implicitly
     * all the methods are abstract implicitly
     */

    int A_VALUE = 10;

    void doX();

    /*
     * Interface is like a contract, that force the stakeholders 
     * to support/implement required functionalites. It is useful
     * when we want many classes that do not belong to the same tree 
     * but share the some functionalities which are not suitable to 
     * add to hierarchical tree.
     */
}

interface InterfaceY {}


class AConcreteClass extends AnAbstractClass implements InterfaceX, InterfaceY {

    @Override
    void doA() {
        System.out.println("Hello, World!");
    }

    @Override
    public void doX() {}
}

public class HelloAbstraction {
    
}
