package textstatistics;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class TextStatisticsApplication extends Application{

@Override
public void start(Stage window){
    BorderPane layout = new BorderPane();
    TextArea text = new TextArea();
    HBox elems = new HBox();

    elems.getChildren().add(new Label("Letters: 0"));
    elems.getChildren().add(new Label("Words: 0"));
    elems.getChildren().add(new Label("The longest word is:"));

    layout.setCenter(text);
    layout.setBottom(elems);

    Scene view = new Scene(layout);

    window.setScene(view);
    window.show();

}

    public static void main(String[] args) {

        launch(TextStatisticsApplication.class);
    }

}
