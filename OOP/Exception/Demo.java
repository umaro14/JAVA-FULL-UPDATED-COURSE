package OOP.Exception;

public class Demo {
    
    
//normal statement => 
//critical statement => big errors (Airplane system crashes)



    public static void main(String[] args) {

        /*int i = 0;     //normal statement
        int j = 0;     //normal statement
        j = 18/i;  //critical statement, because the value of i might not exist...
        System.out.println(j);   //this will stop the execution any line of code below this will not be executed
        System.out.println("This wont be executed");*/

                //SOLUTION

               /*  int  i = 0;
                int j = 0;

                int nums[] = new int[5];

                //it si better to put only critical statements inside blocks
                try{
                    j = 18 / i;
                } 
                catch(Exception e){
                    System.out.println("something went wrong:"  + e);
                }

                System.out.println(j);
                System.out.println("bye!");*/
    

                
                int  i = 2;
                int j = 0;

                int nums[] = new int[5];
                String str = null;
               




                
                try{
                    j = 18 / i;
                    System.out.println(str.length());

                    System.out.println(nums[1]);
                    System.out.println(nums[5]);
                } 
                catch(ArithmeticException e){
                    System.out.println("something went wrong:"  + e);
                }

                catch(ArrayIndexOutOfBoundsException e){
                  System.out.println("Stay within your limit");
                }

                //as we have many exception sometimes we cannot named them all, so we use "Exception" which works for every kind nof exception
                //"Exception" is a parent class it can hasndle all the exceptions
                //the expecified Exceptions mentioned above cannot be put below the Exception....it will throw an error because "Exception" can handle evry exception
                //mentioned above, so there is no point on havem put below the "Exception"
                catch(Exception e){
                    System.out.println("Something else went wrong... " + e);
                }



                System.out.println(j);
                System.out.println("bye!"); //this wont we executed in the catch is = "ArithmeticException" because this will only catch the ArithmeticException exception
                                              //but if we change the Catch to "Exception" this will be excuted , because it catches any exception, then jump into the next line of coede
    }                                         //that is why we can use many catch blocks 
    
}

