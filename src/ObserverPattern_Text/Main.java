package ObserverPattern_Text;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(ObserverPattern_Text.Main.class.getResource("./Pane.fxml"));
        primaryStage.setScene(new Scene(parent, 1000, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
