package STATIC;

//class
public class Human {

    //instance variable
    int age;
    String name;
    int salary;
    boolean married;
    static long population;



    //constructor must have the same name as the its class, this constructor initialise the instances variable (objects)
    public Human(int age, String name, int salary, boolean married){
 
      this.age = age;
      this.name = name;
      this.salary = salary;
      this.married = married;
      //this.population = population; //this is not possible because it is static variable
      //in order to access a static varible you just use the class name
      Human.population += 1; //increments everytime a new Human object is created
     
    }

     //Method/Function
     public void myFunction(){
      System.out.println("Hello, my name is umaro balde and");
    
      
  }


}
