public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory history;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.history = new ChangeHistory();
        addToWarehouse(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.history.add(getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double takenAmt = super.takeFromWarehouse(amount); // Call the superclass method to take the amount
        this.history.add(getBalance()); // Record the balance before the change
        return takenAmt;
    }

    public void printAnalysis(){
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());

    }

    public String history() {
        return history.toString(); // Return the string representation of the change history
    }
}
