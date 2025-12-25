package OOP.Enums;

//Enum (short for Enumeration) is a special data type in Java used to define a fixed set of constant values.

//Example:
//Days of the week, directions, user roles, flight statuses, etc.

// Interface A with hello method
interface A {
    void hello();  // Interface method
}

public class Basic {

    // Enum Week implementing the A interface
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        // Constructor
        Week() {
            System.out.println("Constructor called for: " + this);
        }

        // Implementation of hello() from A interface
        @Override
        public void hello() {
            System.out.println("Hello, how are you?");
        }
    }

    public static void main(String[] args) {
        // Enum constants are implicitly static and final

        Week week;
        week = Week.Monday;  // Assigns Monday to the week variable
        week.hello();  // Calls the hello() method

        // Loop through all the days and print each one
        for (Week day : Week.values()) {
            System.out.println(day);
        }

        // Prints the ordinal of the enum constant Monday (which is 0)
        System.out.println("Ordinal of " + week + ": " + week.ordinal());
    }
}
