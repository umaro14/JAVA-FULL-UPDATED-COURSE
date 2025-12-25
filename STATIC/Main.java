package STATIC;
import FOLDER1.MyClass;

//Main class
public class Main{

 static int amount =45; //even tho is an instance variable this wont need an object of Main to be created in order to its value to be accessed beacause it is static variable

 
    public static void main(String[] args) {
        Human umaro = new Human(24, "Uamro", 10000, true);
        Human amu = new Human(33, "Amu", 15000, true);
        Human nolly = new Human(30, "Nolly", 19000, true);
        MyClass myImportedClass = new MyClass();
        
        //int amount ; //this does not exist every local varible must be initialised before use.

        umaro.myFunction();
        //myImportedClass.myMethod(); // if it was not static
        MyClass.myMethod(); //we didint create an object of MyClass beacause is static

        System.out.println(Main.amount); //we use the class name with dot notation because is static

        System.out.println(umaro.age);
        System.out.println(amu.name);
        System.out.println(umaro.population);
        System.out.println(amu.population);
        System.out.println(nolly.population);

        Main.fun();

}

//this is not dependent on objects
static void fun(){
    Main myFun = new Main();
    myFun.greeting();  //this works
    //greeting() //you cant use this because it requires an instance, but the function you are using it in does not depend on instances/object
}



//this is dependent on objects beacuase, something that is not static belong to an object
void greeting(){
    //fun(); //this will work becuase we can have a static inside a non-static field
    System.out.println("Hello World i am a java master");
}

}

