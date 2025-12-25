package OOP.Generics.BrocodeGenerics.GenericClasses;

//GENERIC CLASSES
public class Main {
    
    public static void main(String[] args) {

        //FOR TWO GENERIC PARAMETERS
        MygenericClass<Integer, Double> myInt = new MygenericClass<>(1, 4.56);
        MygenericClass<Double, Double> myDouble = new MygenericClass<>(3.14, 6.7);
        MygenericClass<Character, Character> myChar = new MygenericClass<>('@', '$');
        MygenericClass<String, String> myString = new MygenericClass<>("Hello", "Umaro");

        //FOR ONE GENERIC PARAMETER
        //MygenericClass<Integer> myInt = new MygenericClass<>(1);
        //MygenericClass<Double> myDouble = new MygenericClass<>(3.14);
        //MygenericClass<Character> myChar = new MygenericClass<>('@');
        //MygenericClass<String> myString = new MygenericClass<>("Hello");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
      
    }
}
