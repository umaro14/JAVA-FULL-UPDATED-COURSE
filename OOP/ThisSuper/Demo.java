
package OOP.ThisSuper;

class A{

        public  A(){
            System.out.println("In A");
        }


        public A(int n){
            System.out.println("In A int");
        }

}
    
class B extends A{
        
    
        public B(){
        
           super(5) ; //is here by default, in every constrcutor....it mean call a constructor of the super class
            System.out.println("In B");
        }


        public B(int N){

            this(); //this will execute the constructor for same class which is public B(){}; then this public B(){} with call the constructor of the super class which is A(){}; 
            System.out.println("In B int");
        }


}


public class Demo {
    

    public static void main(String[] args) {
      
        B obj = new B(5);

        
}
}
