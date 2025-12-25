package OOP.Polymorphsim;

public class MyShapes {

    void area(){
        System.out.println("I am in shapes");
    }


    //EARLY BINDING BRCAUSE THIS IS FINAL SO IT CANNOT BE OVERRIDEN SO IT WILL BE SOLVED AT COMPILE TIME RATRER THEN AT RUNTIME (LATE BINDING)
    /*final void area(){
        System.out.println("I am in shapes");
    }*/

}
