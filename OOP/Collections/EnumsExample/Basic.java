package OOP.Collections.EnumsExample;


public class Basic {

    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        // Constructor
        //this is not piblic or protected, only private or default...why? we dont want to create new objects
        //cos this is not the enum concept, that's why
       //internally: public static final week Monday = new Week();

        Week() {
            System.out.println("Constructor called for: " + this);
        }

        @Override
        public void hello(){
            System.out.println("Hello how are you");
        }
    }

    public static void main(String[] args) {
        // Enum constants are implicitly static and final

        Week week;
        week = Week.Monday; // Assigns Monday to the week variable
        week.hello();

        // Loop through all the days and print each one
        for (Week day : Week.values()) {  
            System.out.println(day);
        }

        // Prints the ordinal of the enum constant Monday (which is 0)
        System.out.println(week.ordinal()); 
    }
}
