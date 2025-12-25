package OOP.Interface;

public class CDPlayer implements Media {
    
    @Override
    public void start() {
        System.out.println("CD Player is playing");
    }

    @Override
    public void stop() {
        System.out.println("CD Player is stopped");
    }
}
