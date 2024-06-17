package title;

import javafx.application.Application;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the title for your application?");
        String title = scanner.nextLine();
            Application.launch(UserTitle.class, "--title=" + title);

    }

}
