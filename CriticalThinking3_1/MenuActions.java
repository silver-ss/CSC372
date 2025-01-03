import javafx.scene.control.TextField;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Region;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class MenuActions {
    // random with seed 40 for consistent change of hue
    private static final Random RANDOM = new Random(40);
    private static int initialRun = 0;

    // get current time and add to timeField
    public static void showDateTime(TextField timeField) {
        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        timeField.setText(formattedDateTime);
    }

    // input text and save that text to a log.txt file
    public static void saveToFile(String input) {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("log.txt", true))) {
            writer.write(input);
            writer.newLine();
            System.out.println("Content Saved to log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // use random number between
    public static void changeBackground(Region stack, MenuItem changeColor) {
        // keep random between 25 and 255, below 25 looks black, not green
        int randomInt = RANDOM.nextInt(25,256);
        String green = String.format("rgb(0, %d, 0)", randomInt);
        stack.setStyle("-fx-background-color: " + green + ";");
        //The menu option should display the initial random hue
        // each time selected for a single execution of the program
        if (initialRun == 0) {
            changeColor.setStyle("-fx-background-color: " + green + ";");
            initialRun += 1;
            System.out.printf("Changed menuItem to rbg(0, %d, 0) & ", randomInt);
        }
        System.out.printf("Changed green background to rbg(0, %d, 0)\n", randomInt);
    }

    //exit with code 0
    public static void quit() {
        System.exit(0);
    }
}
