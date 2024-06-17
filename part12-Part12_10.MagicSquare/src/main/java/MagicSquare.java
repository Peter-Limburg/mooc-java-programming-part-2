
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {

//        return new ArrayList<>();
        //return a list of sums.
        // each sum represents the sum of a row
        //first calc the sum of each row!
        ArrayList<Integer> sums = new ArrayList<>();

        for (int row = 0; row < this.square.length; row++) {
            int sum = 0;
            for (int column = 0; column < this.square[row].length; column++) {
                sum += this.square[row][column];
            }
            sums.add(sum);
//            System.out.println("\n");
        }
        return sums;
    }

    public ArrayList sumsOfColumns() {
        ArrayList sumsCol = new ArrayList<>();

        // either progress horizontal and create 3 lists that later when summed go into one list
        //or progress vertical ro[i] col then up i and get col then up i until row down. progress until no columns left
        // by if column > rowlength return list


        for (int row = 0; row < this.square.length; row++) {
            int sum = 0;
            for (int column = 0; column < this.square[row].length; column++) {
                sum += this.square[column][row];
            }
            sumsCol.add(sum);
//            sumsCol.add(sum); System.out.println("\n");
        }

        return sumsCol;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> sums = new ArrayList<>(); //collection of sums
        int sum1 = 0; //individual sum to later be added to my collection of sums
        int sum2 = 0;
        int column = 0;
        //stopped here
        for (int row = 0; row < this.square.length; row++) {

            sum1 += this.square[row][column];
            sum2 += this.square[row][this.square.length - row - 1];
            column++;
        }

            sums.add(sum1);
            sums.add(sum2);
            return sums;
        }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
