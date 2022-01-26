package Scenario;

import Config.Config;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Scenario {

    private Scene scene;
    private Group root = new Group();

    public  Scenario(Stage primaryStage){
        this.scene = new Scene(root, Config.WIDTH, Config.HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Snake Game- By Adriano Cros");
        primaryStage.show();
    }
}
