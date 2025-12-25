package OOP.Interface.extendDemo2;

public class Main implements A, B{

    @Override
    public void greet() {
      System.out.println("Hello");
    }


    @Override
    public void fun() {
        System.out.println("fun()");
    }


    public static void main(String[] args) {
        
    Main obj = new Main();
    obj.greet();
    obj.fun();

    A.greeting();


    }
  
}
