package OOP.JUNIT5;

public class LaunchCalculate {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        int result1 = calc.divide(10, 2); 
        int result2 = calc.multiply(10, 2);

        if(result1 == 5)
           System.out.println("Test passed");
        else
           System.out.println("Test failed");
    }
}
