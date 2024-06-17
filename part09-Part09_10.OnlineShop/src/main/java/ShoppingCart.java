import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {


    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (items.containsKey(product)) {
            Item item = items.get(product);
            item.increaseQuantity();
        } else {
            Item newItem = new Item(product, 1, price);
            items.put(product, newItem);
        }


    }


    public int price() {
        int totalPrice = 0;
        for (Item piece : items.values()) {
        totalPrice += piece.price();
    }
        return totalPrice;
    }


    public void print(){

        for (Item item : items.values()) {
            System.out.println(item);
        }

    }



}




