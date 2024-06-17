
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        //the above creates scanner and random objects for use

        System.out.println("How many random numbers should be printed?");
        int answer = Integer.valueOf(scanner.nextLine());
        //the above poses a question and captures the given answer

        for(int i = 0; i < answer; i++){
            int num = rand.nextInt(11);
            System.out.println(num);
        }




    }

}
