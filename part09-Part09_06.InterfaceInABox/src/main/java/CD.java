public class CD implements Packable{

    private String artist;

    private String name;

    private int year;

    private double cdWeight;
    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
        this.cdWeight = 0.1;
    }

    @Override
    public double weight() {
        return this.cdWeight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.year + ")";
    }
}
