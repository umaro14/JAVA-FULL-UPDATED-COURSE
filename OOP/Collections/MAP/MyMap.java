package OOP.Collections.MAP;

import java.util.HashMap;
import java.util.Map;

//MAP IS A KEY VALUE PAIR DATASTRUCTURE
//HASHMAP IMPLEMENTS MAP
//KEYS CANNOT BE REPEATED BUT THE VALUES CAN

public class MyMap {
    

    public static void main(String[] args) {
       
        Map<String, Integer> student = new HashMap<>();
        student.put("John", 20);
        student.put("Alice", 22);
        student.put("Bob", 21);
        student.put("John", 25); //overwriting the value of key "John"

        System.out.println(student.get("John")); //gets the values
        System.out.println(student.keySet()); //gets the keys

        for(String key : student.keySet()){
            System.out.println(key + " : " + student.get(key));
        }

    }
}
