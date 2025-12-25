
package OOP.NestedClasses;

//abstract annonymus class

abstract class A{
    public abstract void show();
    public abstract void config();
}




public class AbstractAnnonymus {


    public static void main(String[] args) {
    

       //here we are not creating the object of A as we know we cannot cos it's abstract, but we are creating the object of the annonymus class
       A obj = new A(){

        public void show(){
            System.out.println("Hello show");
        }
        
        public void config(){
            System.out.println("Hello Config");
        }

       };
       obj.show();
       obj.config();

    }
    
}
