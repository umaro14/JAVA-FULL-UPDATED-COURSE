package OOP.Interface2;

//this shows that this interface can only have one methed
//@FunctionalInterface 
interface A{
    void show(int i);

}

/*class B implements A{
   public void show(){
        System.out.println("Hello");
    }
}*/



public class Demo3 {
    
    public static void main(String[] args) {
      
        //this a lambda expression...lamba expression only works with functionalInterface
      A obj = i -> System.out.println("Hello, in show" + i);
       
      

      obj.show(10);

    }
}
