/*import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class week12_JavaFXApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Create a Button
        Button button = new Button("Hello, Click Me");

        // Add an event handler to the button
        button.setOnAction(e -> showAlert("Button clicked!"));

        // Create a layout and add the button
        StackPane root = new StackPane();
        root.getChildren().add(button);

        // Create a Scene and add the layout
        Scene scene = new Scene(root, 250, 150);

        // Set the Scene for the stage (window)
        stage.setTitle("JavaFX Application");
        stage.setScene(scene);
        stage.show();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

 */
