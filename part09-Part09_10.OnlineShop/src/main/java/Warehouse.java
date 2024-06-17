import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {

//    private String product;
//    private int price;
//    private int stock;
    private Map<String, Integer> products;
    private Map<String, Integer> prodsInStock;
    public Warehouse() {
        this.products = new HashMap<>();
        this.prodsInStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        products.put(product,price);
        prodsInStock.put(product, stock);
    }

    public int price(String product){

        if (products.get(product) == null){
            return -99;
        }

       return products.get(product);
    }

    public int stock(String product){
        if (prodsInStock.get(product) == null){
            return 0;
        }
        return prodsInStock.get(product);
    }

    public boolean take(String product){
        if (prodsInStock.get(product) == null || prodsInStock.get(product) == 0){
            return false;
        }
        int num = prodsInStock.get(product);
        num -= 1;
        prodsInStock.put(product, num);
        return true;


    }

    public Set<String> products(){
        return products.keySet();
    }

}
