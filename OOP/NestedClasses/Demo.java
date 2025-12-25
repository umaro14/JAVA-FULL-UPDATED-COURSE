package OOP.NestedClasses;


class A{
    int age;

public void show(){
    System.out.println("Hello show");
}

class B{
   public void config(){
    System.out.println("Hello config");
   }
}

}


public class Demo {

    public static void main(String[] args) {
     
    //superclass    
    A obj = new A();
    obj.show();

    
    //subclass...this how we create an object for the inner class
    A.B obj2 = obj.new B();
    obj2.config();

    }
}
