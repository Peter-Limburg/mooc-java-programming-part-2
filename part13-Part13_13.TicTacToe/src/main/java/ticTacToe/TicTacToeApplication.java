package ticTacToe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class TicTacToeApplication extends Application {
    String player = "X";
    ArrayList<Button> buttons = new ArrayList<>();

    public static void main(String[] args) {

        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        //a text component that includes information about the turn
        Label labelTop = new Label("Turn: " + player);
        labelTop.setFont(Font.font("Monospaced", 25));

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setHgap(10);
        grid.setVgap(10);

//make buttons, set font, add to arraylist
        for (int i = 0; i < 9;i++){
            Button button = new Button();
            button.setFont(Font.font("Monospaced", 40));
            buttons.add(button);
        }


       // add buttons to grid
        int row =  0, col = 0;
        for (Button button : buttons){
            grid.add(button, row, col);
            col++;
            if(col == 3){
                col = 0;
                row++;
            }
        }


        //add event handlers for each button
       for(Button button: buttons){
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    if (button.getText().isEmpty()) {
                        button.setText(player);
                        if (checkIfWin()){
                            labelTop.setText("The end!");
                        } else {
                            takeTurn();
                            labelTop.setText("Turn: " + player);
                        }
                    }
                }
            });
        }


        layout.setTop(labelTop);
        layout.setCenter(grid);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    public void takeTurn() {
        if (player.equals("X")) {
            player = "O";
        } else if (player.equals("O")) {
            player = "X";
        }
    }

    public boolean checkIfWin() {
        return checkRows() || checkColumns() || checkDiagonal();
    }


    public boolean checkRows(){
        if(!buttons.get(0).getText().isEmpty() && (buttons.get(0).getText().equals(buttons.get(1).getText()) && buttons.get(1).getText().equals(buttons.get(2).getText()))) {
        return true;
        } else if (!buttons.get(3).getText().isEmpty() && buttons.get(3).getText().equals(buttons.get(4).getText()) && buttons.get(4).getText().equals(buttons.get(5).getText())) {
            return true;
        } else if (!buttons.get(6).getText().isEmpty() && buttons.get(6).getText().equals(buttons.get(7).getText()) && buttons.get(7).getText().equals(buttons.get(8).getText())) {
            return true;
        }
            return false;
    }

    public boolean checkColumns(){

            if(!buttons.get(0).getText().isEmpty() && buttons.get(0).getText().equals(buttons.get(3).getText()) && buttons.get(3).getText().equals(buttons.get(6).getText())) {
                return true;
            } else if(!buttons.get(1).getText().isEmpty() && buttons.get(1).getText().equals(buttons.get(4).getText()) && buttons.get(4).getText().equals(buttons.get(7).getText())) {
                return true;
            } else if(!buttons.get(2).getText().isEmpty() && buttons.get(2).getText().equals(buttons.get(5).getText()) && buttons.get(5).getText().equals(buttons.get(8).getText())) {
                return true;
            }
            return false;
        }

        public boolean checkDiagonal(){

            if (!buttons.get(0).getText().isEmpty() && buttons.get(0).getText().equals(buttons.get(4).getText()) && buttons.get(4).getText().equals(buttons.get(8).getText())) {
                return true;
            } else if (!buttons.get(6).getText().isEmpty() && buttons.get(6).getText().equals(buttons.get(4).getText()) && buttons.get(4).getText().equals(buttons.get(2).getText())) {
                return true;
            }
            return false;

    }


}

