import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable bison : herd) {
            bison.move(dx, dy);
        }
    }
    public String toString(){
        String statement = "";
         for(Movable bison : herd){
                statement = statement + bison.toString() + "\n";
            }
           return statement;

        }


    }


