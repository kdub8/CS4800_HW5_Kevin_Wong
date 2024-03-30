// Importing ArrayList class from java.util package
import java.util.ArrayList;

// FoodItem interface representing a food item
interface FoodItem {
    // Method to get the name of the food item
    public String getName();

    // Method to get the price of the food item
    public Double getPrice();

    // Method to get the list of toppings for the food item
    public ArrayList<String> getToppings();
}
