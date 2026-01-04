package Coupling.LooseCoupling;

public class WebServiceDataProvider implements UserDataProvider {
  
   @Override
   public String getUserDetails(){
     return "Fethcing Data from Web Service";
   }

}
