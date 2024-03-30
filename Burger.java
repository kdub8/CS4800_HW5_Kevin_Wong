import java.util.ArrayList;

public class Burger implements FoodItem {
    private String name;
    private Double price;
    private ArrayList<String> toppings;

    public Burger(Double price) {
        this.name = "Burger";
        this.price = price;
        this.toppings = new ArrayList<String>();
    }

    @Override
    public String getName() {
        String itemName = this.name;
        if (this.toppings.size() > 0){
            itemName += " with following toppings: ";
        }
        for (String topping : this.toppings){
            itemName += topping + ", ";
        }
        return itemName;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public ArrayList<String> getToppings() {
        return this.toppings;
    }
}