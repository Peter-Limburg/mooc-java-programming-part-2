package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    public void start(Stage stage) {
        // Main layout
        BorderPane layout = new BorderPane();
        layout.setPrefSize(500, 400);


        BorderPane savingsPane = new BorderPane();

        Slider savSlider = new Slider(25, 250, 25);
        savSlider.setShowTickMarks(true);
        savSlider.setShowTickLabels(true);
        savSlider.setMajorTickUnit(25);
        savSlider.setMinorTickCount(3);
        savSlider.setSnapToTicks(true);

        Label savingsValue = new Label("" + savSlider.getValue());

        savingsPane.setLeft(new Label("Monthly savings"));
        savingsPane.setCenter(savSlider);
        savingsPane.setRight(savingsValue);
        savingsPane.setPadding(new Insets(10));

        // Interest control layout
        BorderPane interestPane = new BorderPane();

        Slider intSlider = new Slider(0, 10, 0);
        intSlider.setShowTickMarks(true);
        intSlider.setShowTickLabels(true);
        intSlider.setMinorTickCount(4);

        Label interestValue = new Label("" + intSlider.getValue());

        interestPane.setLeft(new Label("Yearly interest rate"));
        interestPane.setCenter(intSlider);
        interestPane.setRight(interestValue);
        interestPane.setPadding(new Insets(10));

        // Overall control layout
        VBox controls = new VBox();
        controls.getChildren().addAll(savingsPane, interestPane);

        // Chart creation
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle("Savings calculator");

        XYChart.Series savSeries = new XYChart.Series();
        XYChart.Series savIntSeries = new XYChart.Series();

        chart.getData().addAll(savSeries, savIntSeries);

        // Setting up layout
        layout.setTop(controls);
        layout.setCenter(chart);
        layout.setPadding(new Insets(10, 10, 10, 10));

        // Functionality
        savSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            savingsValue.setText("" + newValue.intValue());

            updateSavings(savSlider.getValue(), intSlider.getValue(), savSeries, savIntSeries);
        });
        intSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            interestValue.setText("" + newValue.intValue());

            updateSavings(savSlider.getValue(), intSlider.getValue(), savSeries, savIntSeries);
        });

        updateSavings(savSlider.getValue(), intSlider.getValue(), savSeries, savIntSeries);
        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();
    }

    private void updateSavings(double savings, double interestRate, XYChart.Series savSeries, XYChart.Series savIntSeries) {
        savSeries.getData().clear();
        savIntSeries.getData().clear();

        savSeries.getData().add(new XYChart.Data(0, 0));
        savIntSeries.getData().add(new XYChart.Data(0, 0));

        double savs = 0.0;
        double intrs = 0.0;

        for (int i = 1; i <= 30; i++) {
            savs += savings * 12;
            intrs = (intrs + savings * 12) * (1.0 + interestRate / 100.0);

            savSeries.getData().add(new XYChart.Data(i, savs));
            savIntSeries.getData().add(new XYChart.Data(i, intrs));
        }
    }
}
