package OOP.Interface.extendDemo;

public class Main implements B {


    //from interface A
    @Override
    public void fun() {
        System.out.println("form interface A");
    }

    //from interface B
    @Override
    public void greet() {
        System.out.println("from  inhterface B");
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.fun();
        main.greet();
    }
    
}
