
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array){
        //receive a multidim param and convert it to a string
        StringBuilder connectedString = new StringBuilder();
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++) {
                int val = array[row][column];
                connectedString.append(val);
            }
            connectedString.append("\n");
    }
        return connectedString.toString();
    }

//    StringBuilder numbers = new StringBuilder();
//for (int i = 1; i < 5; i++) {
//        numbers.append(i);
//    }
//System.out.println(numbers.toString());

}
