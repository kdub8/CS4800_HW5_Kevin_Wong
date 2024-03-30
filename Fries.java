// Importing ArrayList class from java.util package
import java.util.ArrayList;

// Fries class implementing FoodItem interface
public class Fries implements FoodItem {
    // Private instance variables
    private String name;
    private Double price;
    private ArrayList<String> toppings;

    // Constructor for Fries class
    public Fries(Double price) {
        // Setting name to "Fries"
        this.name = "Fries";
        // Setting price to the provided price
        this.price = price;
        // Initializing toppings ArrayList
        this.toppings = new ArrayList<String>();
    }

    // Overriding getName method from FoodItem interface
    @Override
    public String getName() {
        // Initializing itemName with base name
        String itemName = this.name;
        // Checking if toppings are present
        if (this.toppings.size() > 0) {
            // Adding message for toppings
            itemName += " with following toppings: ";
        }
        // Looping through toppings and adding to itemName
        for (String topping : this.toppings) {
            itemName += topping + ", ";
        }
        // Returning the final itemName
        return itemName;
    }

    // Overriding getPrice method from FoodItem interface
    @Override
    public Double getPrice() {
        // Returning the price of the Fries
        return this.price;
    }

    // Overriding getToppings method from FoodItem interface
    @Override
    public ArrayList<String> getToppings() {
        // Returning the toppings ArrayList
        return this.toppings;
    }
}
