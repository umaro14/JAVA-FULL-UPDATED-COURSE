package OOP.Threads;


public class Demo2 {
    

    public static void main(String[] args) {

        //lambda expression 
        Runnable ob1 = () -> {
           
                for(int i=0;i<=5;i++){
                    System.out.println("hi");
                    try {Thread.sleep(5);} catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };
        
        Runnable ob2 = () -> {
           
                for(int i=0;i<=5;i++){
                    System.out.println("hello");
                    try {Thread.sleep(5);} catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };
         
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
         
         t1.start();
         t2.start();
    }
}
