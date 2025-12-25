package OOP.Enums;






enum Laptop {

 //WE PASSISNG THE PRICE HERE BECAUSE THESE ARE OBJECTS BY DEFAULT
  Macbook(2000), XPS(2200), Surface, ThikPad(800);
  

  private int price;

  //default cosntructor, the price inside the default constructor will set the price for the objects without parameter/value in the Laptop Enum to be equal to 500
  //in this case is the Surface set to 500.
  private Laptop(){
    price =500;
  }

  private Laptop(int price){
    this.price = price;
    System.out.println("in Laptop" + " " + this.name());  //this.name() is a method 
  }

  public int getPrice(){
      return price;
  }

  public void setPrice(){
    this.price = price;
  }


}



public class Demo2 {
    
    public static void main(String[] args) {
        
    
        //Laptop lap = Laptop.Macbook;
        //System.out.println(lap +" : " + lap.getPrice());
       
      for(Laptop lap : Laptop.values()){
        System.out.println(lap + " : " + lap.getPrice());
      }


    }
}

