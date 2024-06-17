package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.Map;

public class ShanghaiApplication extends Application{

    public static void main(String[] args) {

        launch(ShanghaiApplication.class);
    }

    public void start(Stage stage){
        //makes the two axes for the chart
        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        NumberAxis yAxis = new NumberAxis(0, 100, 5);
        //sets title
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        //makes line chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Shanghai Ranking Consultancy: University of Helsinki");




        //make the dataset!!
        XYChart.Series set = new XYChart.Series();
        set.setName("set");
        //grow the dataset from abject nothingness with the fiery veracity of data
        set.getData().add(new XYChart.Data(2007, 73));
        set.getData().add(new XYChart.Data(2008, 68));
        set.getData().add(new XYChart.Data(2009, 72));
        set.getData().add(new XYChart.Data(2010, 72));
        set.getData().add(new XYChart.Data(2011, 74));
        set.getData().add(new XYChart.Data(2012, 73));
        set.getData().add(new XYChart.Data(2013, 76));
        set.getData().add(new XYChart.Data(2014, 73));
        set.getData().add(new XYChart.Data(2015, 67));
        set.getData().add(new XYChart.Data(2016, 56));
        set.getData().add(new XYChart.Data(2017, 56));
        //add data set to line chart
        lineChart.getData().add(set);
        //javafx time!!!!!!111
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }
    }


