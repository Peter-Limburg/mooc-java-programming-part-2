package application;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> reads;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.reads = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn(){
        return sensors.stream().allMatch(Sensor::isOn);
    }
    @Override
    public void setOn(){
        for (Sensor piece: sensors){
            piece.setOn();
        }
    }


    @Override
    public void setOff(){
        for(Sensor piece: sensors){
            piece.setOff();
        }

    }

    @Override
    public int read(){
        int total = 0;

        if(!isOn() || sensors.isEmpty()){
            throw new IllegalStateException("Average sensor is off or no sensors added");
        }

        for(Sensor piece: sensors){
            total += piece.read();
        }
        int average = total/sensors.size();
        this.reads.add(average);
        return average;
    }


    public List<Integer> readings(){
        return this.reads;
    }

}
