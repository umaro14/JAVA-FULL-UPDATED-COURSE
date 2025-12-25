package OOP.Collections.Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//BEFORE IMPLEMENTING THE COMPARIBLE WE CAN SORT THE STRINNG LIKE SO....THIS COMPAREBLE HAS A METHOD CALLED COMPARETO()

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



public class Demo2 {
    public static void main(String[] args) {

     //SOTING THE SECONND DIGIT....YOU CAN SPECIFY YOUR ONW LOGIC FOR SORTING. this is a lambda expression
      Comparator<Student> comp = (Student i, Student j) ->  i.age > j.age ? 1 : -1;

            

          
        
      List<Student> student = new ArrayList<>();
      student.add(new Student(25, "Umaro"));
      student.add(new Student(30, "Nolly"));
      student.add(new Student(33, "Amu"));
      student.add(new Student(36, "Sulay"));
      

      //SORTING BASED ON THE LAST DIGIGT
      Collections.sort(student, comp);
      
      for(Student s : student){
        System.out.println(s);
      }



    }
}
