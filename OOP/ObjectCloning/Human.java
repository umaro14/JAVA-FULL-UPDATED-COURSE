package OOP.ObjectCloning;
//

//implementa object cloning which is a java interface
public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name){
       this.age = age;
       this.name = name;
       this.arr = new int[] {2,3,4,5,6,7};

    }

     // Hasllow copy
     /*@Override                          //if we dont implement Cloneable this exception will happen
     public Object clone() throws CloneNotSupportedException{

        this is shalow copy
        return super.clone();*/
    
        @Override                          //if we dont implement Cloneable this exception will happen
        public Object clone() throws CloneNotSupportedException{
   
           //this is shallow copy
          Human twin =  (Human)super.clone();

          //this is deep copy
          twin.arr = new int[twin.arr.length];
          for(int i = 0; i < twin.arr.length; i++){

            //for each element of twin.arr[i] copy acurrent object element this.arr[i]
            twin.arr[i] = this.arr[i];
          }

          return twin;
   
   
        }

     }

