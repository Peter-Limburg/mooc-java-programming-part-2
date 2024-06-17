import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> changes;

    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }

    public void add(double status){
        this.changes.add(status);
    }

    public void clear() {
        this.changes.clear();
    }

    public double maxValue(){
        double max = this.changes.get(0);
//        if (changes.isEmpty()){
//            return 0;
//        }
        for (Double piece : changes){
            if (piece > max) {
                max = piece;
            }
        }
        return max;
    }


    public double minValue() {
        double min = this.changes.get(0);
//        if (changes.isEmpty()){
//            return 0;
//        }
        for (Double piece : this.changes){
            if (piece < min) {
                min = piece;
            }
        }
        return min;
    }

    public double average(){
        double size = this.changes.size();
        double total = 0;
        if (this.changes.isEmpty()){
            return 0;
        }
        for (Double piece : this.changes){
            total += piece;
        }
        return total / size;
    }

    public String toString(){
        return changes.toString();
    }
}
