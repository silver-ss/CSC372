import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuUserInterfaceGreen extends Application {
    @Override
    public void start(Stage primaryStage) {
        //Menu
        primaryStage.setTitle("Menu");
        MenuItem showTime = new MenuItem("Show Time");
        MenuItem saveToFile = new MenuItem("Save to File");
        MenuItem changeColor = new MenuItem("Change Color");
        MenuItem quit = new MenuItem("Quit");
        MenuButton menuButton = new MenuButton("Menu", null, showTime, saveToFile, changeColor, quit);
        //Labels
        Label timeLabel = new Label("Date Time:");
        Label inputLabel = new Label("Text Input:");
        timeLabel.setPrefWidth(60);
        inputLabel.setPrefWidth(60);

        //Text Areas
        TextField timeField = new TextField();
        timeField.setEditable(false);

        TextArea inputField = new TextArea();
        inputField.setEditable(true);
        inputField.setPrefSize(200, 60);

        //Horizontal boxes
        HBox row1 = new HBox(10);
        HBox row2 = new HBox(10);
        row1.getChildren().addAll(timeLabel, timeField);
        row2.getChildren().addAll(inputLabel, inputField);

        //GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));

        //Alignment
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setHalignment(HPos.RIGHT);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setHgrow(javafx.scene.layout.Priority.ALWAYS);
        gridPane.getColumnConstraints().addAll(col1, col2);
        gridPane.add(timeLabel, 0, 0);
        gridPane.add(timeField, 1, 0);
        gridPane.add(inputLabel, 0, 1);
        gridPane.add(inputField, 1, 1);

        //Combine items and set scene
        VBox stack = new VBox(10, menuButton, gridPane);
        stack.setPadding(new Insets(10));
        stack.setStyle("-fx-background-color: lightgreen;");
        Scene scene = new Scene(stack, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

        //Menu actions
        showTime.setOnAction(e -> MenuActions.showDateTime(timeField));
        saveToFile.setOnAction(e -> MenuActions.saveToFile(inputField.getText()));
        changeColor.setOnAction(e -> MenuActions.changeBackground(stack, changeColor));
        quit.setOnAction(e -> MenuActions.quit());
    }

    public static void main(String[] args) {
        launch(args);
    }
}