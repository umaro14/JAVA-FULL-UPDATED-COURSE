package STATIC;

public class Mobile {
    String brand;
    int price;
    String network;
    static String name;


    //Static block initialise the stacic name... and it does not matter how many objects you create the static block will be called only once
    //and it will be called before the constructor because it belong to the class and the class loads before anything else
    
    /*static{
        name = "Phone";
        System.out.println("In Static Block");
    }

    public Mobile(){
      brand = "";
      price = 200;
      System.out.println("In constructor");
    }*/

   public void show(){
    System.out.println("Brand: "+brand + " price: " + price + " network: " + network + " name: " + name);
   }

   public static void MyFunction(){
    System.out.println("This is a static function");
   }

    public static void main(String[] args)  {

       //Class.forName() is called: The Class.forName() method explicitly loads a class by name, even without creating an object:
       //Class.forName("Mobile"); 

        Mobile mobile = new Mobile();
        mobile.brand = "Apple";
        mobile.price = 1000;
        mobile.network = "4G";
        mobile.name = "iPhone";

       Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.price = 800;
        mobile2.network = "4G";
        mobile2.name = "Galaxy64";
        

        mobile.show();
        mobile2.show();

        Mobile obj = new Mobile();

        Mobile.MyFunction();
       
    }
}
