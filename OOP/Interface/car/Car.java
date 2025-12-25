package OOP.Interface.car;

import OOP.Interface.Brake;
import OOP.Interface.Engine;
import OOP.Interface.Media;

//interface does not have body only signature
    
public class Car implements Engine, Brake, Media {

    public void brake(){
        System.out.println("Car is braking");
    }

    public void start(){
        System.out.println("Car is starting");
    }

    public void stop(){
        System.out.println("Car is stopping");
    }

    public void acc(){
        System.out.println("Car is accelerating");
    }

   
    
}

