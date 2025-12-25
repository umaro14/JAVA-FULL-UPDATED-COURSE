package OOP.Abstraction;

public class Main {
    


    public static void main(String[] args) {


        Son son = new Son(24);
        System.out.println(son.VALUE);
        son.career();
        son.normal();


        Daughter daughter = new Daughter(22);
        daughter.career();
        daughter.normal();

       //This is a static method within Abstract method
       Parent.hello();

       
        
       ;
   
            
        
            
       
    }
}
