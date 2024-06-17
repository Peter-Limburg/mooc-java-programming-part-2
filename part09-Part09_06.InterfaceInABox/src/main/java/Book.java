public class Book implements Packable{

    private String author;
    private String title;

    private double bookWeight;


    public Book(String author, String title, double bookWeight) {
        this.author = author;
        this.title = title;
        this.bookWeight = bookWeight;
    }

    public double weight(){
        return this.bookWeight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.title;
    }


}
