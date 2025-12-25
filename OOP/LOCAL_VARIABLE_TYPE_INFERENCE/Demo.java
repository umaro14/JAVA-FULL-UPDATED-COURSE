package OOP.LOCAL_VARIABLE_TYPE_INFERENCE;

import java.util.ArrayList;

//THE VAR KEYWORD IS NOT ALLOWED FOR INSTANCE VARIABLES...BECAUSE THE INSTANCE VARIABLES ARE FOR 
//STORAGE AND LOCAL VARIABLES ARE FOR PROCESSING






public class Demo {
    
   

    public static void main(String[] args) {
       
       int a = 9;
       var b = 8; 

       int c;
       //var d;  //var has to be initialized for local vaiables

       int nums[] = new int[10];

       var nums2 = new int[10];
       //var nums2[] = new int[10]; //THIS IS NOT ALLOWED



    }
}
