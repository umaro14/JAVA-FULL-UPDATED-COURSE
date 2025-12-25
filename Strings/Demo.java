package Strings;

public class Demo {
    
    public static void main(String[] args) {
        
        //string object
        //String name = new String("Umaro"); no one does this 

        String name = "umaro";
        name = name + " reddy";  //changes the address but keeping the data

        System.out.println(name);
        System.out.println( name.charAt(0)); //character at the index specified.

        String s1 = "Nolly";
        String s2 = "Nolly";

        System.out.println(s1 == s2);
    }
}
