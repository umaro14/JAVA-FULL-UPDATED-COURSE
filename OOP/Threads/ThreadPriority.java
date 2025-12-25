package OOP.Threads;

public class MyThread extends Thread {

    public MyThread(String name){
        super(name); 
        
    }

    public void run()
    {

        System.out.println(
            Thread.currentThread().getName()
            + " with priority "
            + Thread.currentThread().getPriority());
    }
}

public class ThreadPriority{
    public static void main(String[] args){
        
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        // Setting thread priorities
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
} 
    
// Thread-2 with priority 5
//Thread-1 with priority 1
//Thread-3 with priority 10
