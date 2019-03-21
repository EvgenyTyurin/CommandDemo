package evgenyt.command_demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Command pattern demo
 * Mar 2019 TEY
 *
 * We have abstract Command and subclasses (copy, paste, clear) that we can execute and
 * make undo in editor
 */

public class CommandDemo extends Application {

    /** Build javafx window */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CommandDemo.fxml"));
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.setTitle("Command Pattern Demo");
        primaryStage.show();
        
    }

    /** Run point */
    public static void main(String[] args) {
        launch(args);
    }

}
