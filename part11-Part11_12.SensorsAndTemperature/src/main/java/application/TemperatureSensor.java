package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private int val;
    public TemperatureSensor() {
        this.val = 0;
    }

    @Override
    public boolean isOn() {
        if (val == 1){
            return true;
        }
        return false;
    }
    @Override
    public void setOff(){
        this.val = 0;
    }
    public void setOn() {
        this.val = 1;
    }

    @Override
    public int read(){
        if (isOn()){
            return new Random().nextInt(61) - 30;
        }
            throw new IllegalStateException();

    }

}
