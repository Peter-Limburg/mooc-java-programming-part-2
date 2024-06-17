package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application{

    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();

        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        Button b1 = new Button("Joke");
        Button b2 = new Button("Answer");
        Button b3 = new Button("Explanation");

        menu.getChildren().addAll(b1, b2, b3);

        layout.setTop(menu);

        StackPane l1 = createView("What do you call a bear with no teeth?");
        StackPane l2 = createView("A gummy bear.");
        StackPane l3 = createView("Whereas the wild, roaming noble bear bears rows of teeth, the humble gummy is toothless.");

        b1.setOnAction((event) -> layout.setCenter(l1));

        b2.setOnAction((event) -> layout.setCenter(l2));

        b3.setOnAction((event) -> layout.setCenter(l3));

        layout.setCenter(l1);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();
    }

    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        return layout;
    }

    public static void main(String[] args) {

       launch(JokeApplication.class);
    }

    //3 button


}
