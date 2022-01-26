package Game;

import Event.Event;
import Scenario.Scenario;
import Snake.Snake;
import javafx.application.Application;
import javafx.stage.Stage;


public class Game extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Snake snake = new Snake();
        Scenario scenario = new Scenario(primaryStage, snake);
        Event event = new Event(scenario, snake);
    }
}
