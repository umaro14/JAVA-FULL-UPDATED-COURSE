package OOP.DownUpCasting;

class A{
    public void show1(){
     System.out.println("A");
    }
 }

 class B extends A{
     public void show2(){
         System.out.println("B");
        }
 }



public class Demo {


    public static void main(String[] args) {
        /*double d = 4.5;
        //this is type casting, but we will lose data, the 0.5 will be gone
        int i = (int)d; 
        System.out.println(4);*/
     
     //A does not know about B, but B knows about A...
     //we are going up...upcasting
     A obj = new B();
     obj.show1();

     //downcasting
     B obj1 = (B) obj;
     obj1.show2();





    }
}
