package Coupling.LooseCoupling;

public class UserDatabaseProvider implements UserDataProvider{

    @Override
    public String getUserDetails(){
        return "User details from Database!";
    }

}