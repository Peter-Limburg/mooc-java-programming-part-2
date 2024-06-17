
import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        //i need to make a new die with the set num of faces
        this.random = new Random();
        this.numberOfFaces = numberOfFaces;
        // Initialize the value of numberOfFaces here
    }

    public int throwDie() {
        //i need to return the result of a throw, which should be a val between 1 and the num of faces
        // generate a random number which may be any number
        // between one and the number of faces, and then return it
        int num = random.nextInt(numberOfFaces) + 1;
        return num;
    }
}
