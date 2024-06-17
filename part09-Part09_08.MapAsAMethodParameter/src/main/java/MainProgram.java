import java.util.Map;

public class MainProgram {

    public static void main(String[] args) {
        // test your method here

    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
    public static int returnSize(Map map) {

        int size = 0;
        for (Object key : map.keySet()) {
            size++;
        }
        return size;
    }
}
