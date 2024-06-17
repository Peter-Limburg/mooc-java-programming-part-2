
import java.sql.SQLData;
import java.util.HashMap;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        // Test your program here!}
        HashMap<String, String> hashmap = new HashMap<>();

    }
    public static void printKeys(HashMap<String, String> hashmap){
            Set<String> keys = hashmap.keySet();
            for(String key : keys){
                System.out.println(key);
            }
        }

        public static void printKeysWhere(HashMap<String,String> hashmap, String text){
            Set<String> keys = hashmap.keySet();
            for(String key : keys) {
                if (key.contains(text)){
                    System.out.println(key);
            }
            }
        }

        public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
            Set<String> keys = hashmap.keySet();
            for(String key : keys) {
                if (key.contains(text)){
                    System.out.println(hashmap.get(key));
                }
        }

    }

}
