package OOP.Inheritance;


public class Main {

    public static void main(String[] args) {

        Box box1 = new Box(8, 9, 10);  //if we provide agruments within this box object it will call the cirrespoding constructor with the same number of parameters
        Box box2 = new Box(box1);

        //System.out.println(box1.l + " " + box1.w + " " + box1.h);

       /*  Boxweight box3 = new Boxweight();
        Boxweight box4 = new Boxweight(2, 3, 4, 8);

        System.out.println(box3.h + " " + box3.weight);*/

        //parent class referencing to a child class
        //Box box5 = new Boxweight(2, 3, 4, 8);

        //There many varibles in both parent and child classes
        //You are giving access to varibles that are in the refernce type i.e BoxWeight
        //hence, you should have access to weight varible
        //This also means, that the ones you are trying to access should be initialised
        //but here, when the object itself is of type parent classkl, how will you call the constructorof child class
        //that is why an error occurs
        //Boxweight box6 = new Box(2, 3, 4); invalid

        //System.out.println(box5.weight);  //this wont work although is in the parameter
        //System.out.println(box5.w);  //this will work, we can access all the members of the Boxtype but the of the Box weight.

        //box1.greeting(); //this is possible as well even tho gvreeting method is static
        Box.greeting();

        Box box = new Boxweight();

        box.greeting();
 }

}
