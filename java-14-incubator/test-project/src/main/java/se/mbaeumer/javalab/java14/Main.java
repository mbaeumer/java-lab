package se.mbaeumer.javalab.java14;

//import se.mbaeumer.javalab.java14.records.User;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    private Group root = new Group();
    private Scene scene;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.scene = new Scene(this.root, 1100, 700, Color.WHITESMOKE);
        stage.setTitle("JavaFX sample app");
        stage.setScene(this.scene);
        stage.show();
    }
}
