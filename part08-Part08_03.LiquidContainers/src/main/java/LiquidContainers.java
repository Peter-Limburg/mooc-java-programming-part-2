
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int con1 = 0;
        int con2 = 0;

        while (true) {
            System.out.println("First: " + con1 + "/100");
            System.out.println("Second: " + con2 + "/100");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];


            if (input.equals("quit")) {
                break;
            }

            if (command.equals("add")){
                int amt = Integer.valueOf(parts[1]);
                if (amt > 0) {
                    con1 += amt;
                    if (con1 > 100) {
                        con1 = 100;
                    }
                }
            }
            if (command.equals("move")) {
                int amt = Integer.valueOf(parts[1]);
                if (amt > con1) {
                    con2 += con1;
                    con1 = 0;
                } else {
                    con1 -= amt;
                    con2 += amt;
                }
                if (con2 > 100) {
                    con2 = 100;
                }

            }
            if (command.equals("remove")){
                int amt = Integer.valueOf(parts[1]);
                if (con2 < amt) {
                    con2 = 0;
                } else {
                    con2 -= amt;
                }
            }




        }
    }

}
