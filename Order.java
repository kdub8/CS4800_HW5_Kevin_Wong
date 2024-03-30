import java.util.ArrayList;

public class Order {
    private ArrayList<FoodItem> order;

    public Order() {
        this.order = new ArrayList<FoodItem>();
    }

    public void addItem(FoodItem item) {
        this.order.add(item);
    }

    public void printOrder(){
        for (FoodItem item: this.order) {
            System.out.println(item.getName());
        }
    }

    public Double getTotal(){
        Double total = 0.0;
        for (FoodItem item: this.order) {
            total += item.getPrice();
        }
        return total;
    }
}