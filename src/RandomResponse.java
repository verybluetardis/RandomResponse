import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Simple Random Response Program:
 *
 * 1. Say hello to the user
 * 2. Wait for user input and output it back to the user
 * 3. Respond to user input using a randomized pre-set list of responses
 * 4. Wait for user response
 * 5. Repeat 2 - 4 until keyword 'goodbye' is entered
 * 6. Say goodbye to user
 * 7. End program
 */
public class RandomResponse {

    public void start() {
        println("Hello, user! Talk to me."); // This prints a line to the user using a string

        ArrayList<String> list = new ArrayList<String>(); // Class that creates new list of strings
        list.add("You will be assimilated."); // Calling the method that adds strings to the ArrayList
        list.add("Not my cup of tea.");
        list.add("Surely not.");
        list.add("Nope.");
        list.add("Because... grumpy cat.");
        list.add("Wibbly wobbly timey wimey.");

        Random rand = new Random(); // Instance of class Random that creates randomized number generator
        Scanner scanner = new Scanner(System.in); // Instance of class Scanner that takes in info from user input

        String userResponse = scanner.nextLine(); // Creating a type (string) of a variable (userResponse) that will
        // hold the information from scanner.nextLine

        while (!userResponse.equalsIgnoreCase("goodbye")) { // while loop beginning with basic expression saying that
            //while the user response does not equal goodbye, keep going!
            println("You said: " + userResponse); // This will print the user's response back to them

            int nextInt = rand.nextInt(list.size()); // This creates a variable nextInt that will use the method rand on
            //said variable to randomize that within the arraylist
            String randomString = list.get(nextInt); // This gets the randomized item from the arraylist to respond to
            //the user

            println("I say: " + randomString); // This is what the program will respond to the user; I Say, and then a
            //random response from the arraylist

            userResponse = scanner.nextLine(); // This stores the user's response to be be repeated within the loop
        }

        println("Goodbye, user."); // This prints to the user once they have entered in 'goodbye'
    }

    /**
     * Helper method for printing a string to the console.
     *
     * @param message This is the string you print to the console.
     */
    public static void println(String message) {
        System.out.println(message);
    }
}
