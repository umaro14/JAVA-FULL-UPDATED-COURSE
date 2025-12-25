package OOP.Generics.BrocodeGenerics.GenericClasses;

//GENERIC CLASS
public class MygenericClass <Thing, Thing2> {
    Thing x;
    Thing2 y;

    public MygenericClass(Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing2 getValue(){
        return y;
    }

}
