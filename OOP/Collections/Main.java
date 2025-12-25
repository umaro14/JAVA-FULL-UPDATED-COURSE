package OOP.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();   //ArrayList is the child implementing the parent List
        List<Integer> list2 = new LinkedList<>();

        list2.add(67);
        list2.add(78);
        list2.add(97);
        list2.add(90);
        list2.add(909);
        list2.add(908);

        
        list.add(67);
        list.add(78);
        list.add(97);
        list.add(90);
        list.add(909);
        list.add(908);

       

        
        System.out.println(list2);
        System.out.println(list2.size());
        System.out.println(list2.get(4));
        System.out.println(list2.isEmpty());
        System.out.println(list2.hashCode());
        System.out.println(list2.stream());
        //System.out.println("removed:" + list.remove(4));
        

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(4));
        System.out.println(list.isEmpty());
        System.out.println(list.hashCode());
        System.out.println(list.stream());

    }
}
 