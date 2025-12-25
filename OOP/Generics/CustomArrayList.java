package OOP.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    //cannot directly change this
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
       if(this.isFull()){
        this.resize();
       }

       data[size++] = num;
    }

    
    private void resize() {

        //it doubles the size of the data if it is full
       int[] temp = new int[data.length * 2];

       for(int i = 0; i < data.length; i++){

        // Copy elements from data to temp
        temp[i] = data[i]; 
       }

       // Now data refers to the larger array
       data = temp;
    }

    //copy the current items into the new array
    

    //if the size is equal to data.length then it is full, if data.length is less than size then is not full
    private boolean isFull() {
        return size == data.length;
    }

    //remove 
    public int remove(){

        //decrease the size by one  This is a pre-decrement operation. It decreases the value of size by 1 before it is used in the expression.
       int removed = data[--size]; 
       return removed;
    }


    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

  @Override
  public String toString() {
     return " CustomArrayList{" +
     "data=" + Arrays.toString(data) + 
     ", size=" + size +
     '}';
  }

    public static void main(String[] args) {
        //ArrayList list = new ArrayList();


        //with no generics meaning we can any type of data
        CustomArrayList list = new CustomArrayList();
       // list.add(1);
        //list.add(2);
       // list.add(3);
        //list.add(4);

        //adding values at once
        for (int i = 0; i <14; i++){
            list.add(2 * i); //this will add values in a interval of 2
        }

        System.out.println(list);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        System.out.println(list2);
      
    }
}
