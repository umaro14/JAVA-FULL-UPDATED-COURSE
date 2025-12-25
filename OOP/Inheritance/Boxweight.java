package OOP.Inheritance;

public class Boxweight extends Box {
    double weight;

    //CONSTRUCTOR
    public Boxweight(){
       this.weight = -1;
       //this.l = 3; this wont work beacsu is set to private in the superclass
    }

    // STATIC METHOD CANNOT BE OVERRIDEN

    //@Override
    static void greeting(){
      System.out.println("Hello, i am in Box class");
  }
    
    //CONSTRUCTOR
    public Boxweight(double l, double h, double w, double weight){
        super(l, h, w);   //// Calls the constructor of the superclass Box with parameters l, h, and w
        this.weight = -1;
     }
}