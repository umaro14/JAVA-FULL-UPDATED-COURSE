package FileHandling.File;

import java.io.File;
import java.io.FilenameFilter;

public class ListAllFiles {
     public static void main(String args[])
    {

        // try-catch block to handle exceptions
        try {

            String myPath = "C:\\Users\\ajkla\\OneDrive\\Documents\\JAVA-TECH-STACK\\JAVA-FULL-COURSE-TELUSKO\\";
            // Create a file object
            File f = new File(myPath);

               // Create a FilenameFilter
            FilenameFilter filter = new FilenameFilter() {

                public boolean accept(File f, String name)
                {
                    return name.startsWith("my");
                }
            };

            // Get all the names of the files present
            // in the given directory
            String[] files = f.list();

            System.out.println("Files are:");

            // Display the names of the files
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
