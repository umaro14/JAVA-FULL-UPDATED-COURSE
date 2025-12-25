package STATIC;






//this outter class cannot be static
public class InnerClasses {
    

    //but this can be static
    static class Test{
        String name;
    
        //constructor
         public Test(String name){
         this.name = name;
       }
     }

  

    public static void main(String[] args) {

      //WE WOULD USE THIS IF TEST WAS NOT STATIC
    //object for the Top-level class 
     //InnerClasses inner = new InnerClasses();

     //object for the inner class
     //Test test = inner.new Test("Amu");

     Test a = new Test("Amu"); //object for the constructor, because costructor cannot be static therefore it needs an object
     Test b = new Test("Nolly");


      System.out.println(a.name);
      System.out.println(b.name);
      
    }
    
}
