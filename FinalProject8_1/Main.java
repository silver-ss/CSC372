import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char option = 'a';
        LinkedList<Student> studentList = new LinkedList<Student>();
        // While Loop for menu options
        while(option != 'q') {
            System.out.println("choose an option?\n" +
                    "a - add a student\n" +
                    "f - save to file\n" +
                    "p - print students\n" +
                    "s - sort students by name\n" +
                    "q - quit");
            // get full line to clean up scanner
            String input = scnr.nextLine();
            // make sure input is not empty
            if (input.isEmpty()) {
                System.out.println("Please provide a valid input");
                // if empty return to while loop menu
                continue;
            }
            // pull the first character from the input
            option = input.charAt(0);
            // send the option char through the switch
            switch (option) {
                case 'a':
                    // prompt user for student data with validation method
                    Student student = InputStudents.AddStudent(scnr);
                    // add the new student to the linked list
                    studentList.add(student);
                    // print confirmation
                    System.out.println(student.getName() + " added");
                    break;
                case 'f':
                    //save to file method returns success statement if complete
                    System.out.println(SaveToFile.SaveFile(studentList));
                    break;
                case 'p':
                    //print to validate sort before saving to file
                    for (Student s : studentList) {
                        System.out.println(s.getName());
                    }
                    break;
                case 's':
                    // selection sort by name, returns success statement if complete
                    System.out.println(SelectionSort.SortStudents(studentList, new SortByName()));
                    break;
                case 'q':
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid option please provide a lower case letter from the menu");
            }
        }
        scnr.close();
    }
}