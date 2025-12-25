package OOP.Generics;

import java.util.Arrays;
import java.util.List;


//here T should either be Number or its subclasses
public class WildCard<T extends Number>{
    //cannot directly change this
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; //also working as index value

     public  WildCard(){
        data = new Object[DEFAULT_SIZE];
    }


    public void getList(List<? extends Number> list){
        //do something

        
    }


    public void add(T num){
       if(this.isFull()){
        this.resize();
       }

       data[size++] = num;
    }

    
    private void resize() {

        //it doubles the size of the data if it is full
       Object[] temp = new Object[data.length * 2];

       for(int i = 0; i < data.length; i++){

        // Copy elements from data to temp
        temp[i] =  data[i]; 
       }

       // Now data refers to the larger array
       data = temp;
    }


    //if the size is equal to data.length then it is full, if data.length is less than size then is not full
    private boolean isFull() {
        return size == data.length;
    }

    //remove 
    public T remove(){
        //decrease the size by one  This is a pre-decrement operation. It decreases the value of size by 1 before it is used in the expression.
       T removed = (T) (data[--size]);
       return removed;
    }


    public T get(int index){
        return (T) data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
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
    
        WildCard<Integer> list3 = new WildCard();
        for (int i = 0; i < 14; i++){
            list3.add(2 * i); //this will add values in a interval of 2
        }


      System.out.println(list3);
    }
}
