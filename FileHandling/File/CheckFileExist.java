package FileHandling.File;

import java.io.File;

public class CheckFileExist {
    public static void main(String[] args){

        // Accept file name or directory name through
        // command line args
        //String fname = args[0];
        String fname = ("myfile.txt");

        // pass the filename or directory name to File
        // object
        File f = new File(fname);

        // apply File class methods on File object
        System.out.println("File name :" + f.getName());
        System.out.println("Path: " + f.getPath());
        System.out.println("Absolute path:" + f.getAbsolutePath());
        System.out.println("Parent:" + f.getParent());
        System.out.println("Exists :" + f.exists());

        if (f.exists()) {
            System.out.println("Is file: " + f.isFile());
            System.out.println("Is writable: " + f.canWrite());
            System.out.println("Is readable: " + f.canRead());
            System.out.println("Is a directory :" + f.isDirectory());
            System.out.println("File Size in bytes " + f.length());
            System.out.println("File last Modified " + f.lastModified());
        }
    }
}
