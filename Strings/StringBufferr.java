package Strings;

public class StringBufferr {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Umaro");  //this string can be changed
        sb.append(" Reddy");
        //System.out.println(sb.length());
        System.out.println(sb);

        //String str = sb; this is wrong
        //String str = sb.toString(); //this will convert the StringBuffer to string

        sb.deleteCharAt(2); //deletes the character at the specified index....
        sb.insert(5, " dev "); //insert "dev" into sd...
        sb.setLength(30);
        sb.ensureCapacity(100); //minimum capacity
        System.out.println(sb);
    }
}
