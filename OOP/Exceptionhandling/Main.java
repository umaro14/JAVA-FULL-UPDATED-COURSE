package OOP.Exceptionhandling;

// Custom Exception Class
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Main {
    
    public void myFunction(){
        System.out.println("mine bro");
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
             //Attempt to divide
            divide(a, b);
            
            // Check name and possibly throw MyException
            String name = "umaro";
            if(name.equals("umaro")){
                throw new MyException ("name is umaro");
            }

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        catch (MyException e) {
            System.out.println(e.getMessage());
        } 
        
        catch(Exception e){
            System.out.println("Something went wrong");
        } 
        
        finally {
            // This will always run
            Main main = new Main();
            main.myFunction();
        }  
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
