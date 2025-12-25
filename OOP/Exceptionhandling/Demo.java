package OOP.Exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws NumberFormatException, IOException{
      
      int num = 0;
    
      //try with resources
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        
        num = Integer.parseInt(br.readLine());
        System.out.println(num);
      } 
      
      catch (Exception e) {
       
      }

  

    }
}
