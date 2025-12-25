package OOP.SEALED_CLASSES;


//Imagine you are building an airport system:
//You want to control types of tickets:

//public sealed class Ticket permits EconomyTicket, BusinessTicket, FirstClassTicket { }


sealed class A extends K implements Cloneable permits B,C {}

//The class B with a sealed direct supertype A should be declared either final, sealed, or non-sealed
sealed class B extends A permits D {}

//The class C with a sealed direct supertype A should be declared either final, sealed, or non-sealed
final class C extends A {}

//Whwnever you extend a seald class the extending class shoud be either, sealed, non-sealed or final
non-sealed class D extends B{}  //any class can extend this non-sealed class

sealed class K{}

//INTERFACES CANNOT BE FINAL ONLY SEALED OR NON-SEALED
sealed interface X permits Y {}

non-sealed interface Y extends X   {}

public class Demo {
    

    public static void main(String[] args) {
        
    }
}
