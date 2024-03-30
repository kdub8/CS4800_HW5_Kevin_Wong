// Importing ArrayList class from java.util package

import java.util.ArrayList;
// Burger class implementing FoodItem interface

public class Burger implements FoodItem {
    // Private instance variables

    private String name;
    private Double price;
    private ArrayList<String> toppings;
    // Constructor for Burger class

    public Burger(Double price) {

        this.name = "Burger";
        this.price = price;
        this.toppings = new ArrayList<String>();
    }

    @Override
    public String getName() {
        String itemName = this.name;
        // Checking if toppings are present
        // Adding message for toppings

        if (this.toppings.size() > 0){
            itemName += " with following toppings: ";
        }
        // Looping through toppings and adding to itemName

        for (String topping : this.toppings){
            itemName += topping + ", ";
        }
        return itemName;
    }
    // Overriding getPrice method from FoodItem interface

    @Override
    public Double getPrice() {
        return this.price;
    }
    // Overriding getToppings method from FoodItem interface

    @Override
    // Returning the toppings ArrayList

    public ArrayList<String> getToppings() {
        return this.toppings;
    }
}