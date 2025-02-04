import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class SaveToFile {
    // method to close the file with try and IO catch
    public static void closeFile(FileWriter fileName) {
        try {
            // if we will have a valid file name print and close file
            if (fileName != null) {
                System.out.println("Closing File...");
                fileName.close(); // might throw IO exception
            }
        } catch (IOException e) {
            System.out.println("ERROR: failed to close file: " + e.getMessage());
        }
    }

    public static String SaveFile(LinkedList<Student> studentList) {
        String fileName = "student.txt";
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName);// might throw IO exception
            System.out.println("Writing file to " + fileName + "...");
            // loop through linkedList and write a fomatted string for each Student object
            for (Student s : studentList) {
                String formattedString = String.format("Name: %s, Address: %s, GPA: %.2f\n"
                        , s.getName(), s.getAddress(), s.getGPA());
                writer.write(formattedString); // might throw IO exception
            }

        } catch(IOException e) {
            System.out.println("ERROR: Failed to save file " + e.getMessage());
        // close file where IO exception is hit or not.
        } finally {
            closeFile(writer);
        }
        return ("Successfully Saved file to " + fileName + "!");
    }
}