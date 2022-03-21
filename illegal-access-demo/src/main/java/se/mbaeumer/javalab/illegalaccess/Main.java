package se.mbaeumer.javalab.illegalaccess;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    private final Group root = new Group();
    private Scene scene;
    private FlowPane flowGeneral;
    private Button btnOpenLink;

    @Override
    public void start(Stage stage) throws Exception {
        this.scene = new Scene(this.root, 200, 100, Color.WHITESMOKE);
        stage.setTitle("Illegal access demo");
        stage.setScene(this.scene);
        stage.show();
        this.initLayout();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void initLayout() {
        this.createGeneralFlowPane();
        this.createButton();
    }

    public void createGeneralFlowPane() {
        this.flowGeneral = new FlowPane();
        this.flowGeneral.setOrientation(Orientation.VERTICAL);
        this.flowGeneral.setPrefWrapLength(700);
        this.flowGeneral.setVgap(5);
        this.root.getChildren().add(this.flowGeneral);
    }

    private void createButton(){
        this.btnOpenLink = new Button("Go to squeed.com");
        this.btnOpenLink.setOnAction((actionEvent -> {
            try {
                BrowserLauncher.openURL("http://www.squeed.com");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        this.flowGeneral.getChildren().add(this.btnOpenLink);
    }
}
