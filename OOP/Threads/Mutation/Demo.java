package OOP.Threads.Mutation;

class Counter {

    int count;

    public  void increment(){
       count++;
    }

}



public class Demo {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        //lambda expression 
        Runnable ob1 = () -> {
           
                for(int i=0;i<=1000;i++){
                    counter.increment();
                }
        };
        
        Runnable ob2 = () -> {
           
                for(int i=0;i<=1000;i++){
                    counter.increment();
                }
        };
         
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
         
         t1.start();
         t2.start();

         t1.join();
         t2.join();

         System.out.println(counter.count);
    }
}
