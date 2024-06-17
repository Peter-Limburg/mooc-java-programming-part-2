import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry = new HashMap<>();

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    public boolean add(LicensePlate licensePlate, String owner){
        //use hash to connect plate to owneer...if no owner yeet, add
        if (!registry.containsKey(licensePlate)){
            registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }


    public String get(LicensePlate licensePlate){
        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if (registry.containsKey(licensePlate)){
            registry.remove(licensePlate);
                    return true;
        }
        return false;
    }

    public void printLicensePlates(){
        for (LicensePlate licensePlate : registry.keySet()){
            System.out.println(licensePlate);
        }
    }

    public void printOwners(){
        ArrayList<String> myList = new ArrayList<>();
        for (String owner : registry.values()){
            if (!myList.contains(owner)){
                System.out.println(owner);
                myList.add(owner);
        }

    }

        }


}
