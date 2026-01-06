package FileHandling.Reader;

import java.io.FileReader;
import java.io.Reader;

public class Main {
      public static void main(String[] args)
    {
        try {
          
            // Create a FileReader object which is a subclass of Reader
            Reader reader = new FileReader("example1.txt");

            // Read one character at a time from the file
            int data = reader.read();
            while (data != -1) {                                       //-1 → no more data to read EOF(end of file)
              
                // Convert the int to char and print
                System.out.print((char)data);                          //Ex: int 65 → char 'A'
                data = reader.read();
            }

            // Close the reader
            reader.close();
        }
        catch (Exception ex) {
          System.out.println("An error occurred: " + ex.getMessage());
        }
    }
}
