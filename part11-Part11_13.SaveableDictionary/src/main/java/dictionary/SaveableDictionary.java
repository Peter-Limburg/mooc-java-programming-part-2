package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.stream.Collectors;
public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private File file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {

        this();
        this.file = new File(file);
    }

    public void add(String words, String translation) {
        if (!dictionary.containsKey(words)) {
            dictionary.put(words, translation);
        }
        if (!dictionary.containsValue(words)) {
            dictionary.put(translation, words);
        }
    }

    public String translate(String word) {
        if (!dictionary.containsKey(word)) {
            return null;
        }
        return dictionary.get(word);
    }

    public void delete(String word) {
        dictionary.entrySet().removeIf(entry ->
                word.equals(entry.getKey()) ||
                        word.equals(entry.getValue()));

    }

    public boolean load() {
        try  {
            Scanner scanner = new Scanner(Paths.get(this.file.getName()));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                this.dictionary.putIfAbsent(parts[0], parts[1]);
                this.dictionary.putIfAbsent(parts[1], parts[0]);
            }
            return true;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean save(){
        try {
            PrintWriter writer = new PrintWriter(new File(this.file.getName()));
            ArrayList<String> alreadyAdded = new ArrayList<>();

            this.dictionary.keySet().stream()
                            .forEach(p -> {
                                if (alreadyAdded.contains(p)){
                                    return;
                                }
                                alreadyAdded.add(p);
                                alreadyAdded.add(dictionary.get(p));
                                writer.println(p + ":" + dictionary.get(p));

                                    });
            writer.close();
            return true;

        } catch (Exception e){
            return false;
        }


    }


}
