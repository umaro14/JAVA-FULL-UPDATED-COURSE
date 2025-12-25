package Arrays;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //store a roll number
        int a = 19;

        //store a person name
        String name = "umaro";

        //store r roll numbers
        int rno1 = 56;
        int rno2 = 52;
        int rno3 = 23;
        int rno5 = 67;
        int rno6 = 12;

        //datatype[] variable_name = new datatype[size];

    String[] myArray = {"mango", "apple", "banana"};

    Scanner MyScanner = new Scanner(System.in);

    String myitem = MyScanner.nextLine();


    for( int index = 0; index < myArray.length; index++){
        if(myArray[index].equals(myitem)){
            System.out.println("item found is" + " " + myitem + " " + "at" + " " + index);
        }
    }



    int[] rumbers = new int[10];
    //or
    int[] rnumbers1 = {12, 34, 56, 67};


    }
}
