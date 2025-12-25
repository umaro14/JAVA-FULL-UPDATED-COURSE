
    import java.util.Scanner;

public class LianerSearch {

    public static void main(String[] args) {
        // Define the array of strings to search in
        String[] myArray = {"Mamdu", "Rui", "Abulai", "Sano", "Doli", "Mussa", "Nitchon", "Umaro"};
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name to search: ");
        String target = scanner.nextLine();  // Read the target string from the user

        // Perform the linear search and store the result
        String result = myLinearSearch(myArray, target);

        // Output the result
        if (result != null ) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Not found: " + target);
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to perform a linear search on the array
    static String myLinearSearch(String[] myArray, String target) {
        
        if (myArray.length == 0) {
            return null;  // Return null if the array is empty
        }

        // Iterate through each element in the array
        for (int index = 0; index < myArray.length; index++) {
            String element = myArray[index];

            // Use equals() to compare strings
            if (element.equals(target)) {
                return element;  // Return the element if it matches the target
            }
        }

        return null;  // Return null if the target is not found
    }
}


