package OOP.STREAM_API;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

//STREAM API
//stream api is a feature of java 8 that allows you to process data in a more functional
//way. it is a sequence of elements that can be processed in a pipeline of operations.
//stream api is lazy, meaning that it only processes the data when it is actually needed.
//stream api is also parallelizable, meaning that it can be processed in parallel by multiple threads.
//stream api is a more functional way of processing data, which means that it is more declarative
//than imperative. this means that you specify what you want to do with the data, rather than
//how to do it.
//stream api is composed of several key concepts:
//1. stream: a stream is a sequence of elements that can be processed in a pipeline of
//operations.
//2. source: a source is the origin of the stream. it can be a collection,
//an array, or any other type of data source.
//3. intermediate operation: an intermediate operation is an operation that is applied to
//the stream, but does not produce a result. examples of intermediate operations include
//filter, map, reduce, and flatMap.
//4. terminal operation: a terminal operation is an operation that produces a result from the
//stream. examples of terminal operations include forEach, collect, and reduce.
//5. pipeline: a pipeline is a sequence of intermediate and terminal operations that are
//applied to the stream.



public class Demo {
    
    public static void main(String[] args) {
        
      List<Integer> numbers = Arrays.asList(4,5,7,3,2,6);
   
      //THIS FUNCTION WILL BE APPLIED INSIDE THE FOREACH FUNCTION INSTEAD OF WRITING IT INSIDE THE FOREACH FUNCTION
      //THIS CONSUMER WILL AFFECT THE FOREACH FUNCTION
      //LAMBDA EXPRESSION
      Consumer<Integer> con =  n -> {
            if(n % 2 == 0){              
                System.out.println(n);
            }
      };
   
      //APPLYING THE CONSUMER FUNCTION TO THE STREAM FOR EACH...IT WILL APPLY THE CON FUNCTION TO ALL THE ELEMENTS IN NUMBERS
      numbers.forEach(con);

      
    //  Stream<Integer> s1 = numbers.stream();
    //  //s1.forEach(n -> System.out.println("stream:" + n));
    //  //s1.forEach(n -> System.out.println("stream:" + n));//THIS WILL NOT PRINT ANYTHING BECAUSE THE STREAM IS LAZY AND IT ONLY EXECUTES ONCE
     
    //  Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
    //  Stream<Integer> s3 = s2.map(n -> n * 2);
    //  int result = s3.reduce(0, (c, e) -> c + e);

    

    
    //OR WE CAN DO THE ABOVE ALL IN ONE LINE
    int result = numbers.stream()
                  .filter(n -> n % 2 == 0)
                  .map(n -> n * 2)
                  .reduce(0, (c, e) -> c + e);

     System.out.println(result);



    }
}
