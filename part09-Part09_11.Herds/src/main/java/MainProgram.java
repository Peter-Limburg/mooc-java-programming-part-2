

public class MainProgram {

    public static void main(String[] args) {
        Herd herd = new Herd();
        herd.addToHerd(new Organism(5,10));
        herd.move(0,1);
        System.out.println(herd.toString());
    }
}
