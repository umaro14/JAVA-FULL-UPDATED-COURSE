package OOP.Encapsulation;

class Human{

  //accessible only in this Human class...and instance variables should be set to private as a good habit
  private int age;
  private String name;


  //default constructor....default values
    Human(){
      this.age = 12;
      this.name = "Nolly";
  }


  //parametarised constructor
  Human(int a, String n){
     age = a;
     name = n;
}


  public int getAge(){
    return age;
  }

  public void setAge(int age){
    this.age = age;
  }


  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

}


class Demo{
  public static void main(String[] args) {
    
    Human obj = new Human();

    obj.setAge(24);
    obj.setName("Umaro");

    System.out.println(obj.getAge() + " " + obj.getName());



  }
}

