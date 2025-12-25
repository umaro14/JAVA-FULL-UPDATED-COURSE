package OOP.Collections.Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Student {
    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        
        return "Student [age=" + age + ", name=" + name + "]";
    }
}



public class Demo {
    public static void main(String[] args) {

     //SOTING THE SECONND DIGIT....YOU CAN SPECIFY YOUR ONW LOGIC FOR SORTING
      Comparator<Integer> comp = new Comparator<Integer>() {
        
         public int compare(Integer i, Integer j){
            if(i % 10 > j % 10) //THIS COMPARES THE LAST DIGIT
              return 1;    //IF WE RETURN 1 I WILL SWAP -1 OTHERWISE
            else
            return -1;
         }
      };  
        
      List<Integer> nums = new ArrayList<>();
      nums.add(51);
      nums.add(24);
      nums.add(87);
      nums.add(12);
      nums.add(94);

      //SORTING BASED ON THE LAST DIGIGT
      Collections.sort(nums, comp);
      
      

      System.out.println(nums);


    }
}
