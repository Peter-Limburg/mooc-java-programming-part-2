package application;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MultipleViews extends Application {

    public static void main(String[] args) {

        launch(MultipleViews.class);
    }
    @Override
    public void start(Stage window) {
        //main layout!
        BorderPane layout = new BorderPane();
        VBox vert = new VBox();
        GridPane grid = new GridPane();

        Label text1 = new Label("First view!");
        Button button1 = new Button("To the second view!");
        Button button2 = new Button("To the third view!");
        Label text2 = new Label("Second view!");
        Label text3 = new Label("Third view!");
        Button button3 = new Button("To the first view!");


        //1stview
        layout.setTop(text1);
        layout.setCenter(button1);

        //2nd view

        vert.getChildren().add(button2);
        vert.getChildren().add(text2);

        grid.add(text3, 0, 0);
        grid.add(button3, 1, 1);
        //
        Scene first = new Scene(layout);
        Scene second = new Scene(vert);
        Scene third = new Scene(grid);

        button1.setOnAction((event) -> {
            window.setScene(second);
        });

        button2.setOnAction((event) -> {
            window.setScene(third);
        });

        button3.setOnAction((event) -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();

    }
}
