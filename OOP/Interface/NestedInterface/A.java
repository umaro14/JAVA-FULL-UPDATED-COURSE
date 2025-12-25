package OOP.Interface.NestedInterface;

public class A {
    
    //nested interface
    public interface nestedInterface {

        boolean isOdd(int num);
}

}
 
// we are using the dot notation becaus we are implementing an interface that is within A calss.
class B implements A.nestedInterface {

    @Override
    public boolean isOdd(int num) {

        //bitwise operator
        return (num & 1) == 1;
    }

}

