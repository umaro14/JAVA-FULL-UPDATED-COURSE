package OOP.Inheritance;

//SUPER CLASS

public class Box {

    //private double l;  //this wont be inherited outside this package cos is set to private
    private double l;  
    double h;
    double w;


    static void greeting(){
        System.out.println("Hello, i am in Box class8");
    }

    //default consturctor
    Box () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }


    //one paremeter constructor

    Box (double side){

        this.l = side;
        this.h = side;
        this.w = side;
    }

     //three paremeter constructor
    Box (double l, double h, double w){  //the super keyword is calling this
        this.l = l;
        this.h = h;
        this.w = w;
       }

    
    Box (Box old){
        this.l = old.h;
        this.h = old.w;
        this.w = old.l;
       
       }

    public void infomation(){
        System.out.println("Running the box");
    }

    
}

