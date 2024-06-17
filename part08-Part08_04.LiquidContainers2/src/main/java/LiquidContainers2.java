
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container con1 = new Container();
        Container con2 = new Container();

        while (true) {
            System.out.println("First: " + con1.toString());
            System.out.println("Second: " + con2.toString());

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            if (input.equals("quit")) {
                break;
            }

            if (command.equals("add")) {
                int amt = Integer.valueOf(parts[1]);
                con1.add(amt);
            }

            if (command.equals("move")) {
                int amt = Integer.valueOf(parts[1]);
                if (con1.contains() >= 0 && con1.contains() < amt) {
                    con2.add(con1.contains());
                    con1.remove(amt);
                } else {
                    con1.remove(amt);
                    con2.add(amt);
                }
            }
            if (command.equals("remove")){
                int amt = Integer.valueOf(parts[1]);
                con2.remove(amt);

            }

        }

    }
}
