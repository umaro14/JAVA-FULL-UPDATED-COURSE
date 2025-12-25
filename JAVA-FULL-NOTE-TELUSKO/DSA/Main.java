import java.util.Scanner;

public class Main{


    public static void main(String[] args) {

      String[] MyArray = {"Mamdu", "Rui", "Abulai", "Sano", "Doli", "Mussa", "Nitchon", "Umaro"};
    
    String target = "Umaro";
     

      String ans = MyLinearSearch(MyArray, target);
      System.out.println(ans);

      
}

    static String MyLinearSearch(String[] MyArray, String target ){
    if(MyArray.length == 0){
        return null;
        }

         for(int index = 0; index < MyArray.length; index++){
            String element = MyArray[index];
            
            //for String we use equals because it compares two objects and a String is an object
            if(element.equals(target)){
               return element;
            }
        
    }

    return null;
    } 
}


    
