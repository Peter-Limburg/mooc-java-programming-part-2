public class Item {

    private int qty;
    private String product;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.qty = qty;
        this.product = product;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity(){
        this.qty++;
    }

    public String toString(){
        return this.product +": " + this.qty;


    }



}
