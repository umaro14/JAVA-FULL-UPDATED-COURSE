package OOP.Polymorphsim;

public class Main {

    public static void main(String[] args) {

       MyShapes shape = new MyShapes();
       shape.area();
       MyShapes circle = new Circle();  //this will call what inside the circle class not Myshapes class
       circle.area();
       Square square = new Square();
       square.area();

        
    }
    
}
