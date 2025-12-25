package OOP.Abstraction;

public class Daughter extends Parent {


     //age is field in Parent abstract class
     public Daughter(int age){
        super(age);
      }
    
    @Override
    void career(){
        System.out.println("i am a doctor");
    }

    @Override

    void partner(){
        System.out.println("My partner is Swedish");
    }
    
}
