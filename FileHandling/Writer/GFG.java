package FileHandling.Writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class GFG {
        public static void main(String[] args)
    {
        try (Writer writer = new BufferedWriter( new FileWriter("buffered.txt"))) {
            writer.write("BufferedWriter makes writing more efficient.");
            writer.write("\nIt reduces disk I/O by using a buffer.");
            System.out.println("Data written using BufferedWriter.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
