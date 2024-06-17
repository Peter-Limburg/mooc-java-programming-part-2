import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxWeight;
    private ArrayList<Item> items;


    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }

    @Override
    public void add(Item item) {
        int currentWeight = 0;
        for(Item piece: items){
            currentWeight += piece.getWeight();
        }
        if (currentWeight + item.getWeight() <= this.maxWeight) {
            items.add(item);
        } else {
            System.out.println("Max weight exceeded");
        }


    }


}
