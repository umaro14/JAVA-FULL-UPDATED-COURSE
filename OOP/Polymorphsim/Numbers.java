package OOP.Polymorphsim;

public class Numbers {


    //method overloading

    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b;
    }

    public static void main(String[] args) {

        Numbers obj = new Numbers();

        obj.sum(2,56);
        obj.sum(2,56, 66);
    }
    

}
