package Arrays;

public class Demo1 {
    

    public static void main(String[] args) {
        
        int num = 5;
        //Integer num1 = new Integer(num);  //boxing
        Integer num1 = num;  //autoboxing, because it is beeing converted automatically into an object

        //int num2 = num1.intValue();   //unboxing, from an object type to a primitive type
        int num2 = num1;   //Auto-unboxing

        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);  //turns a String into a Integer
        System.out.println(num3);
        
    }
}
