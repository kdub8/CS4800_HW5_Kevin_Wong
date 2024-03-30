// Importing ArrayList class from java.util package
import java.util.ArrayList;

// Order class for managing customer orders
public class Order {
    // Instance variable to store the list of food items in the order
    private ArrayList<FoodItem> order;

    // Constructor for Order class
    public Order() {
        // Initializing the order ArrayList
        this.order = new ArrayList<FoodItem>();
    }

    // Method to add a food item to the order
    public void addItem(FoodItem item) {
        // Adding the item to the order ArrayList
        this.order.add(item);
    }

    // Method to print the order
    public void printOrder(){
        // Looping through the order ArrayList and printing each item's name
        for (FoodItem item: this.order) {
            System.out.println(item.getName());
        }
    }

    // Method to calculate the total cost of the order
    public Double getTotal(){
        // Initializing total cost to 0
        Double total = 0.0;
        // Looping through the order ArrayList and adding each item's price to the total
        for (FoodItem item: this.order) {
            total += item.getPrice();
        }
        // Returning the total cost of the order
        return total;
    }
}
