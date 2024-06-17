
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double count = 0;

        while (true) {
            double input = Double.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            } else if (input > 0) {
                total += input;
                count++;
            }

        }
        double average = total/count;
        System.out.println(average);
        if (total <= 0 && count <= 0) {
            System.out.println("Cannot calculate the average");
        }

    }
}
