package OOP.Interface.extendDemo2;

public interface A {


    // Static Interface Methods should all have a body....because they cannot be Inherited/Overriden
    //Ex: static void method1();
    
    //call via the interface name no need to create an object because it is static
    static void greeting(){
      System.out.println("Hei i am static method");
    }

    default void fun(){
        System.out.println("i am in A");
    };
}
