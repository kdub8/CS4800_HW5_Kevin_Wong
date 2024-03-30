// Importing ArrayList class from java.util package
import java.util.ArrayList;

// KetchupTopping class implementing FoodItem interface
public class KetchupTopping implements FoodItem {
    // Private instance variables
    private FoodItem food;
    private Double price;

    // Constructor for KetchupTopping class
    public KetchupTopping(FoodItem food, Double price){
        // Setting food item and price
        this.food = food;
        this.price = price;
        // Adding "Ketchup" topping to food item
        this.food.getToppings().add("Ketchup");
    }

    // Overriding getName method from FoodItem interface
    @Override
    public String getName() {
        // Returning the name of the food item
        return this.food.getName();
    }

    // Overriding getPrice method from FoodItem interface
    @Override
    public Double getPrice() {
        // Returning the total price including the topping
        return this.price + this.food.getPrice();
    }

    // Overriding getToppings method from FoodItem interface
    @Override
    public ArrayList<String> getToppings() {
        // Returning the toppings of the food item
        return this.food.getToppings();
    }

}
