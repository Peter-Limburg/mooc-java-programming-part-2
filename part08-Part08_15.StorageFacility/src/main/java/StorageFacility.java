import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item){
        storage.putIfAbsent(unit, new ArrayList<>());
        storage.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit){
        return storage.getOrDefault(storageUnit, new ArrayList<>());
    }


    public void remove(String storageUnit, String item) {
        ArrayList<String> items = storage.get(storageUnit);
        if (items != null) {
            items.remove(item);
            if (items.isEmpty()) {
                storage.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> units =  new ArrayList<>();
        for (String piece : storage.keySet()){
            units.add(piece);
        }
        return units;
    }


}
