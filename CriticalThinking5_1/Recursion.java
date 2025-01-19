import java.util.Scanner;

public class Recursion {
    public static int[] inputs = new int[5];

    //recursion method
    public static int multiplyAll(int n) {
        //BaseCase: all number in the array have been multiplied
        if (n >= inputs.length) {
            //once base case is hit multiply by 1 and exit recursive loop
            return 1;
        }
        //Recursive call to multiply array item by next item in array
        return inputs[n] * multiplyAll(n + 1);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String initialPrompt = "Input 5 integers separated by spaces";
        String invalidPrompt = "Invalid Input. Enter exactly 5 integers.";
        boolean validInput = false;

        while (!validInput) {
            //prompt the user for 5 integers
            System.out.println(initialPrompt);
            //read whole line
            String userInput = scnr.nextLine();
            String[] parts = userInput.split("\\s+");
            if (parts.length == 5) {
                try {
                    for (int i = 0; i < 5; i++) {
                        inputs[i] = Integer.parseInt(parts[i]);
                    }
                    validInput = true; // exit while
                } catch (NumberFormatException e) {
                    System.out.println(invalidPrompt);
                }
            } else {
                System.out.println(invalidPrompt);
            }
        }
        scnr.close();
        //call recursive method starting at index 0
        System.out.println("The Product of those 5 numbers is: "
                + multiplyAll(0));
    }
}