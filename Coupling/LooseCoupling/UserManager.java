package Coupling.LooseCoupling;

//THIS CLASS DO NOT NEED TO CHANGE AND STILL IT CAN TAKE USERDATABASEPROVIDER AND WEBSERVICEDATAPROVIDER..lOOSLY COUPLED
public class UserManager {

    private UserDataProvider userDataProvider; 
          
    
    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo(){
        return userDataProvider.getUserDetails();
    }

}
