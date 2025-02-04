import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class InputStudents {

    public static Student AddStudent(Scanner scnr) {
        String name;
        String address;
        double GPA;

        while (true) {
            try {
                System.out.println("Enter the student's full name:");
                name = scnr.nextLine();
                // handle cases where the input name is null
                if (name.length() == 0) {
                    throw new IllegalArgumentException("ERROR: Name cannot be blank.");
                }
                break;// exit the while loop if valid name provided
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter the student's address:");
                address = scnr.nextLine();
                // handle cases where the input address is null
                if (address.length() == 0) {
                    throw new IllegalArgumentException("ERROR: Address cannot be blank.");
                }
                break;// exit the while loop if valid address provided
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter the student's GPA:");
                GPA = scnr.nextDouble();
                scnr.nextLine(); // clear scanner new line char
                // validate that GPA is between 0 and 4
                if (GPA > 4.0 || GPA < 0.0) {
                    throw new IllegalArgumentException("ERROR: GPA must be between 0.0 and 4.0");
                }
                break; // exit while loop if valid GPA is provided
            // catch GPAs that are double but not in the 0-4 range
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            // catch non-double GPAs being input
            } catch (InputMismatchException e) {
                scnr.nextLine(); // clear scanner missed if sting value input
                System.out.println("ERROR: please enter a number between 0.0 and 4.0");
            }
        }
        //create a new student object and return that object
        return new Student(name, address, GPA);
    }
}