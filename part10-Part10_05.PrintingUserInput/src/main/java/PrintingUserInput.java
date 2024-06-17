
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stuff = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
          stuff.add(input);

        }

        stuff.stream()
                .forEach(n -> System.out.println(n));


    }




}
