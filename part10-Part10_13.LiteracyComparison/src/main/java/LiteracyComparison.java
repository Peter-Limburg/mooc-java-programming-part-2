
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> rows = new ArrayList<>();


        try {
            Files.lines(Paths.get("literacy.csv"))
                    .forEach(row -> rows.add(row));

            rows.stream()
            .map(row -> row.split(","))
                    .sorted((a, b) -> {
                        return a[5].compareTo(b[5]);
                    })
                    .forEach(row -> System.out.println(row[3] + " (" + row[4] + "), " + row[2].split(" ")[1].trim() + ", " + row[5]));

        }  catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }





    // theme, age group, gender, country, year, literacy percent

}
