package OOP.Generics.BrocodeGenerics.BoundedTypes;



//GENERIC CLASS
public class MygenericClass <Thing extends Number, Thing2> {
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
