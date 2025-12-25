package OOP.Generics.BrocodeGenerics.GenericMethods;

public class Game {
    

    public static void main(String[] args) {
        
        Player player = new Player();
        Enemy enemy = new Enemy();
        Item item = new item();
        Tree tree = new Tree();
    }

    public static <Thing> void draw(Thing x){
        x.draw();
    }
}
