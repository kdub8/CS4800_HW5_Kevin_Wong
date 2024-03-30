// Importing ArrayList class from java.util package

import java.util.ArrayList;
// CheeseTopping class implementing FoodItem interface

public class CheeseTopping implements FoodItem {
    private FoodItem food;
    private Double price;
    // Constructor for CheeseTopping class

    public CheeseTopping(FoodItem food, Double price){
        // Assigning food item and price

        this.food = food;
        this.price = price;
        // Adding "Cheese" topping to the food item's toppings list

        this.food.getToppings().add("Cheese");
    }
    // Overriding getName method from FoodItem interface

    @Override
    public String getName() {
        return this.food.getName();
    }
    // Overriding getPrice method from FoodItem interface

    @Override
    public Double getPrice() {
        return this.price + this.food.getPrice();
    }
    // Overriding getToppings method from FoodItem interface

    @Override
    public ArrayList<String> getToppings() {
        return this.food.getToppings();
    }

}