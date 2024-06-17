public class Organism implements Movable{

    private int x;
    private int y;
    public Organism(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(int dc, int dy){
        x += dc;
        y += dy;
    }

    public String toString(){
        return "x: " + x + "; y: " + y;
    }

}
