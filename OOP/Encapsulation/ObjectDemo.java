package OOP.Encapsulation;

public class ObjectDemo {


   int num;
   float gpa;

   public ObjectDemo(int num, float gpa){
     this.num = num;
     this.gpa = gpa;
   }



   //CLASS OBJECTS

    //IT GIVES A NUMBER REPRESANTATION OF AN OBJECT
    @Override
    public int hashCode() {
        
        return super.hashCode();  //this will return a random number representing the object, it is not the address
        //return num; this will return the numvalue
    }

    @Override
    public boolean equals(Object obj) {
       
        return super.equals(obj);
    }


    //CLONE => Creates and returns a copy of this object. 
    //The precise meaning of "copy" may depend on the class of the object. The general intent is that, for any object x, the expression
    @Override
    protected Object clone() throws CloneNotSupportedException {
       
        return super.clone();
    }

    @Override
    public String toString() {
        
        return super.toString();
    }


    //THIS GETS CALLED WHEN GARBAGE COLLECTION ITS
    @Override
    protected void finalize() throws Throwable {
        
        super.finalize();
    }

    public static void main(String[] args) {

        ObjectDemo obj1 = new ObjectDemo(14, 57.9f);
        ObjectDemo obj2 = new ObjectDemo(10, 78.7f);
        //ObjectDemo obj = obj1; //same number as the obj1

        if(obj1.gpa < obj2.gpa){
            System.out.println("obj is less than obj1");
        }

        if(obj1.equals(obj2)){
            System.out.println("obj is equal than obj1");
        }

        System.out.println(obj2.hashCode());
        System.out.println(obj1.hashCode());
    }
}
