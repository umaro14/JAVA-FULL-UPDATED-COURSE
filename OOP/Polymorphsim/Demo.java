package OOP.Polymorphsim;


class Computer{

}


 class  Laptop {
  
}

class A{
  public void show(){
    System.out.println("in A show");
  }
}

class B extends A{
    public void show(){
        System.out.println("in B show");
      }
}


class  C extends A{
    public void show(){
        System.out.println("in C show");
      }
}


public class Demo {
    

    public static void main(String[] args) {

            //A is the reference and B is the object, so B method will be called  
            //A obj = new B();

            A obj = new A();
            obj.show();

            //now we asign the B to the old obj
            obj = new B();
            obj.show();

            obj = new C();
            obj.show(); 

        
    }
}
