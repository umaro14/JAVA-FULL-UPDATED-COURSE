package OOP.Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        
     ArrayList<Integer> arr = new ArrayList<>();
 
    for(int i = 0; i < 5; i++){
        arr.add(i + 1);
     }

    // arr.forEach((item)-> System.out.println(item * 2));

    //or

    Consumer<Integer> fun = (item) -> System.out.println(item * 2);
    arr.forEach(fun);


     Operation sum = (a, b) -> a +b;

    }

    int sum(int a, int b){
        return a+b;
    }


    
}

interface Operation{
    int sum(int a, int b);
}
