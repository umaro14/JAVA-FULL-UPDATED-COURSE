package OOP.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Vector {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();   //ArrayList is the child implementing the parent List
        List<Integer> list2 = new LinkedList<>();

        list2.add(67);
        list2.add(78);
        list2.add(97);
        list2.add(90);
        list2.add(909);
        list2.add(908);

        
        System.out.println(list2);

       /*  Vector<Integer> vector = new Vector<>();
        
        // Add elements to the Vector
        vector.add(1);
        vector.add(2);
        vector.add(21);
        vector.add(24);*/

        
       
    }
}
 

