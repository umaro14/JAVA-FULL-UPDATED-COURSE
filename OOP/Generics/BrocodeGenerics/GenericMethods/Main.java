package OOP.Generics.BrocodeGenerics.GenericMethods;

public class Main {

    //GENERIC METHOD, <Thing> takes anything
     public static <Thing> void displayArray(Thing[] array){
        for(Thing x : array){
            System.out.println(x+" ");
        }
        System.out.println();
    }

    //The return type of this Generic method is Thing.
    public static <Thing> Thing getFirstEl(Thing[] array){
        return array[0];
    };

    
    public static void main(String[] args) {
        
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.5, 2.4, 3.7, 4.9, 5.1};
        Character[] charArray = {'a', 'f', 'u', 'b', 'k'};
        String[] stringArray = {"u", "m", "a", "r", "o"};

        displayArray(intArray);
        System.out.println(getFirstEl(intArray));
        System.out.println(getFirstEl(doubleArray));
        System.out.println(getFirstEl(charArray));
        System.out.println(getFirstEl(stringArray));

    }

   
}
