package OOP.Interface2;


class Laptop{
    public void code(){
        System.out.println("Coding on laptop");
    }
}


class Devloper{

    public void devApp(Laptop laptop){  //this an issue we cannot do this...solution is on Demo2 go and check it out
       laptop.code();
    }
}


public class Demo {
    

    public static void main(String[] args) {
        
     Laptop laptop = new Laptop();

     Devloper umaro = new Devloper();
     umaro.devApp(laptop);


    }
}
