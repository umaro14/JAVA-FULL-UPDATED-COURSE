package Coupling.TightCoupling;

public class UserManager {

//You cannot replace UserDatabase (e.g. API, file, mock)
//Hard to unit test
//Violates Dependency Inversion Principle (D in SOLID)
    //1️⃣ Direct object creation
    private UserDatabase userDatabase = new UserDatabase();
    
    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}
