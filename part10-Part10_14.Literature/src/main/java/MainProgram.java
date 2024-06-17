
import java.sql.SQLOutput;
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();


        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String input1 = scanner.nextLine();
            if (input1.isEmpty()){
                break;
            }
            System.out.println("Input the age recommendation:");
            int input2 = Integer.valueOf(scanner.nextLine());
            books.add(new Book(input1, input2));
        }

        System.out.println(books.size() + " books in total.");
//        for(Book vol : books){
//            System.out.println(vol);
//        }


        Comparator<Book> comparator = Comparator
            .comparing(Book::getAge)
            .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        System.out.println("Books:");
        for(Book piece: books){
            System.out.println(piece);
        }

    }

}
