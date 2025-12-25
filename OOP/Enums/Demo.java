package OOP.Enums;

enum Status {

    //we cannot extends other Classes to Enums
    //we cannot implements other Interfaces to Enums
    //we cannot use new keyword to create instances of Enums
    //Enum extends a Enum class by default
    //all these are objects by default
    Running, Failed, Pending, Success;
}



public class Demo {
    
    public static void main(String[] args) {
        
       
       //Status status = Status.Success;
       //System.out.println(status.ordinal());  //this will get the number of Success which is 3

       /*Status[] status = Status.values();
       System.out.println(status);

       for(Status status2 : status){
        System.out.println(status2);
       }*/


    Status s = Status.Success;

    


    //swirch loops good in case of Enums

    switch (s) {
        case Running:
             System.out.println("Running, all good");
            break;
        case Failed:
             System.out.println("Failed, something went wrong");
             break;
        case Pending:
             System.out.println("Pending, waiting for something");
             break;
        case Success:
             System.out.println("Success, all good");
             break;
        default:
             System.out.println("DONE");
       
    }


    }
}
