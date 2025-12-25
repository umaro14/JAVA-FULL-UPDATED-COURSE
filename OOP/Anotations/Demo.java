package OOP.Anotations;

@Deprecated  // program element annotated @Deprecated is one that programmers are discouraged from using. An element may be deprecated for any of several reasons, for example, its usage is likely to lead to errors;
//it may be changed incompatibly or removed in a future version; it has been superseded by a newer, usually preferable alternative; or it is obsolete.

class A{
   public void showTheDataWhichBelongsToThisClass(){
      System.out.println("Hello, in A Show");
   }
}

class B extends A {

    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("Hello, in B Show");
    }
}


public class Demo {
    

    public static void main(String[] args) {
        
      B obj = new B();
      obj.showTheDataWhichBelongsToThisClass();

    }
}
