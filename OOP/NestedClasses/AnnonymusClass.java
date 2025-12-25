package OOP.NestedClasses;

// Anonymous class is a class without a name


class A {
    public void show(){
        System.out.println("Inside class A");
    }
}

/*class B extends A {
    public void show(){
        System.out.println("Inside class B");
    }
}*/

public class AnnonymusClass {
    

    public static void main(String[] args) {
        
    //A obj = new B();  //will call show in B class


    //this gonna say do not go to previous design/ Show function; use this new one...but we do this only if it will be overriden once
    //and it's called annonymus class, no names
    A obj = new A(){
        public void show(){
            System.out.println("Inside Annonymus Class");
        }
    };  
    obj.show();

    }
}
