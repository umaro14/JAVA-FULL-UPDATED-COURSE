package OOP.ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human umaro = new Human(34, "umaro");
       //Human twin = new Human(umaro);   //making a copy of umaro

       //twin will have the same value as umaro because is copying umaro's values by cloning it.
        Human twin = (Human)umaro.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr)); //if we dont use the ToString method this will only print the object reference not the the values of the arr


        //this wont be added to umaro because is a deep copy, nut it will be added to twin
        twin.arr[0] = 100;
       
        //this umaro arr values change wont change 
        System.out.println(Arrays.toString(umaro.arr));
        //this twin arr will change
        System.out.println(Arrays.toString(twin.arr));
    }
}
