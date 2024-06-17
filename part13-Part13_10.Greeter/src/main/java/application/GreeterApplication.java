package application;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application {


    public static void main(String[] args) {

       launch(GreeterApplication.class);
    }


    @Override
    public void start(Stage window) {
        VBox view1 = new VBox();
        Label label1 = new Label("Enter your name and start.");
        TextField text1 = new TextField("");
        Button button1 = new Button("Start");

        GridPane view2 = new GridPane();
        Label label2 = new Label("");

        view1.getChildren().add(label1);
        view1.getChildren().add(text1);
        view1.getChildren().add(button1);
        view2.add(label2, 0, 0);

        Scene screen1 = new Scene(view1);
        Scene screen2 = new Scene(view2);


                button1.setOnAction((event) ->
                {
                    String name = text1.getText();
                    label2.setText("Welcome " + name + "!");
                    window.setScene(screen2);
                });

                window.setScene(screen1);
                window.show();

    }


}
