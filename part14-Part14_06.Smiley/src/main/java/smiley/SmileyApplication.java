package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.lang.management.GarbageCollectorMXBean;

public class SmileyApplication extends Application{

    @Override
    public void start(Stage window) {
        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        ColorPicker colorPalette = new ColorPicker();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        paintingLayout.setRight(colorPalette);

        double squareSize = 20;
        drawSquare(painter, 200, 200, squareSize); // Left eye
        drawSquare(painter, 320, 200, squareSize); //right eye
        drawSquare(painter, 240, 280, squareSize); // Left side of mouth
        drawSquare(painter, 260, 280, squareSize); // Middle of mouth
        drawSquare(painter, 280, 280, squareSize); // Right side of mouth



        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }


private void drawSquare(GraphicsContext gc, double x, double y, double size){
        gc.setFill(Color.BLACK);
        gc.fillRect(x, y, size, size);
}



    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }
}
