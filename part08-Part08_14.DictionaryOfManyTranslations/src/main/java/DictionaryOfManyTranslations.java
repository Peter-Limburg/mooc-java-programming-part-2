import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> map;

    public DictionaryOfManyTranslations() {
        this.map = new HashMap<>();
    }

    public void add(String word, String translation){
        this.map.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> translations = this.map.get(word);

        translations.add(translation);

    }

    public ArrayList<String> translate(String word){
        ArrayList<String> trans = new ArrayList<>();
        if(map.containsKey(word)){
            trans = map.get(word);
        }

        return trans;

    }

    public void remove(String word){
        this.map.remove(word);

    }



}
