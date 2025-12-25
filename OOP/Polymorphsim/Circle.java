package OOP.Polymorphsim;

public class Circle extends MyShapes {


    @Override //this is called annotation to check whether a method is being overriden or not
    void area(){
        System.out.println("Area is pie * r *r");
       
    }

}

