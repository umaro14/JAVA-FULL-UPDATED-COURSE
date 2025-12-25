
//Outer class

class Calculator {


 int num; //instance varibale saved in Heap memory 

//Method overloading because it has more than one method with the same name within the same class
   public int add(int n1, int n2, int n3){
       
       return n1 + n2 + n3;  //local variable saved in stack memory
   }

  public int add(int n1, int n2){
      return n1 * n2;  //locall variable saved in stack memory
  }
}


public class Main{

      
  public static void main(String[] args) {


 Calculator obj = new Calculator();
 int result = obj.add(8, 180);
 System.out.println(result);

      


 }
}