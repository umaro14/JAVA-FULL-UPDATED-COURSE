package FileHandling.File;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args)
    {
        // Writing Text File       
        try {

            FileWriter Writer = new FileWriter("myfile.txt", true);

            // Writing File
            Writer.write("\nFiles in Java are seriously good!!");
            Writer.close();
            
            System.out.println("Successfully written.");
        }

        // Exception Thrown
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
