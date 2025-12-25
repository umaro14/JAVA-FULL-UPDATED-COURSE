package OOP.Interface2;

 

interface A{
   //static void show(){}; static interface Methods should allways have body because they cannot be overriden
    
    //these two method are public and abstract by default
    void show();
    void config();
    int age = 5;


    //this variable is by default public static final, they have to be initialised here or in a static block
    //int name = 45;

}

interface X extends A{
    public void showx();
}

class B implements  X{
  public void show(){
    System.out.println("A, show method is called");
  }

  public void showx(){
    System.out.println("X, showx method is called");
  }

  public void config(){
    System.out.println("b, config method is called");
  }
}
  
    public class Demo2 {
        

        public static void main(String[] args) {
           
  
         B b = new B();
         b.show();
         b.config();
         b.showx();
         System.out.println(A.age);
 
        
        }
    }
