
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    Random random = new Random();
    public LotteryRow() {

        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();

    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        //range is 1-40!
        //total of 7 nums drawn
        Random random = new Random();
        for (int i = 0; i < 7; i++){
            int num = random.nextInt(40) + 1;
            while(containsNumber(num)){
                num = random.nextInt(40) + 1;
            }
            this.numbers.add(num);
        }

    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (this.numbers.contains(number)){
            return true;
        }
        return false;
    }
}

