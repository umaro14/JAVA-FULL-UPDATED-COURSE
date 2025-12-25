package OOP.Collections.SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//COLLECTION EXTENDS ITERRATOR

//SET DO NOT HAVE DUPLIICATES....SET IMPLEMENTS HASHSET CLASS...AND IT DOES NOT PRINT VALUES IN ORDER
//SET DOES NOT SUPORT INDEX VALUE
//IF WE WANT TO SORT THE SET WE WILL HAVE TO USE TREESET

public class MySet {
    

    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        Set<Integer> sortedNums = new TreeSet<Integer>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(2);
        
        //sorted
        sortedNums.add(7);
        sortedNums.add(2);
        sortedNums.add(3);
        sortedNums.add(7);

        //WE CAN USE THE ITERRATOR CLASS TO PRINT ALL VALUES
        //ITERATOR IS USED TO PRINT THE VALUES IN ORDER
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }


        
        for(int n : nums){
            System.out.println(n);
        }

        for(int sn : sortedNums){
            System.out.println(sn);
        }

    }
}
