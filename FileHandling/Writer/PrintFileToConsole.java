package FileHandling.Writer;

import java.io.PrintWriter;
import java.io.Writer;

public class PrintFileToConsole {
    public static void main(String[] args) {
        try{
            
            // Create a Writer instance that writes to console
            Writer writer = new PrintWriter(System.out);

            // Write the String 'GeeksForGeeks' to the stream
            //writer.write("GeeksForGeeks");

            String string = "GFG";

            // Get the starting index
            int startingIndex = 2;

            // Get the length of char
            int lengthOfstring = 1;

            writer.write(string, startingIndex, lengthOfstring);

            // Flush the stream to ensure data is printed
            writer.flush();

        //Output: G

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
