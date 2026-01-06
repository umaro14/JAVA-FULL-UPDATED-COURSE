package FileHandling.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Geeks {
    public static void main(String[] args)
    {
        try {
          
            // Create a FileWriter to write to a file named "example.txt"
            FileWriter writer = new FileWriter("example1.txt", true);   //this true allows to addad text instead of overiding

            // Write a simple message to the file
            writer.write("Hello, from file writer, It has been so nice learning java!");

            // Close the writer
            writer.close();

            System.out.println("Message written:");
            
            
            
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}