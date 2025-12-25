package OOP.Threads;



//instead of extending Thread class we can just implement Runnable class 
//becasue The runnable class has the Run() method too. 

//CHECK DEMO2 FILE

class A extends Thread {
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10); //this will wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class  B extends Thread {
    public void run() {
        for(int i=0;i<=100;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


public class Demo {
    

    public static void main(String[] args) {
         A ob1 = new A();
         B ob2 = new B();
         
         ob2.setPriority(Thread.MAX_PRIORITY);

         //they are threads now...this will run now in parallel
         ob1.start();

         //this will put a time gap between these 2 threads
         //and try to optimize it by executing one thread after another
         //but is not guaranteed that it will excute one thread trice before the other
         try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         ob2.start();
    }
}
