package OOP.Abstraction;

public abstract class Parent {
     //abstract method can only belong to an abstract class
     //abstarct class can have nomal method and abstarct method
     //and you cannot create an object of an abstract class 
    //we can create a variable inside a abstract class
    int age;

    final int VALUE;

    public Parent(int age){
       this.age = age;
       VALUE = 109008;
    }

    static void hello(){
        System.out.println("Hello");
    }

    void normal(){
        System.out.println("Normal");
    }

    //Abstact methods do not have body
    abstract void career();
    abstract void partner();
}
