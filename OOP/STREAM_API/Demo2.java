package OOP.STREAM_API;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
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



public class Demo2 {
    
    public static void main(String[] args) {
        
      List<Integer> numbers = Arrays.asList(4,5,7,3,2,6);


    //THIS WILL RETURN AITHER FALSE OR TURE
    Predicate<Integer> p = n ->  n % 2 == 0;
    
    System.out.println(p.test(4));  //THIS WILL BE TRUE, COS 4%2 == 0
    System.out.println(p.test(5));  //THIS WILL BE FALSE, COS 5%2 !=0

    Function<Integer, Integer> f = new Function<Integer,Integer>() {

        @Override
        public Integer apply(Integer n) {
            return n * 2;
        }
        
    };
    
    
    int result = numbers.stream()
                  .filter(p)
                  .map(f)
                  .reduce(0, (c, e) -> c + e);

    //SORTS THE VALUES              
    Stream<Integer> sortedValues = numbers.stream()
                  .filter(n -> n % 2 == 0)
                  .sorted();
    
    //FILTERING WITH MULTIPLE THREADS. THIS PARALLELSTREAM WILL CREATE THE THREAD FASTER
    Stream<Integer> multipleThreads = numbers.parallelStream()
                  .filter(n -> n % 2 == 0);
                  

    sortedValues.forEach(n -> System.out.println(n));              

     System.out.println(result);
     



    }
}
