package OOP.Inheritance;

public class MyInheritance {
   
    public void myMethod(int a, int b){
        int sum1 = a * b;
        System.out.println("My child will inherit from me" + " " +
         sum1);  
      
    }

}

class Manytimes1 extends MyInheritance{
    public void myMethod(){
        int num1 = 22;
        int num2 = 25;
        int sum = num1 + num2;
        System.out.println(sum);
    }
}

class Manytimes2 extends MyInheritance{
    public void myMethod(){
        System.out.println("Hello, i am being inherited from Manytimes but second time");
    }
}





class MyClass {
    public static void main(String[] args) {
        
        MyInheritance myInheri = new MyInheritance();
        Manytimes1 manytimes1 = new Manytimes1();
        Manytimes2 manytimes2 = new Manytimes2(); 
        
        myInheri.myMethod(2,5);
        manytimes1.myMethod();
        manytimes2.myMethod();
    }
}