import java.util.ArrayList;

public class KetchupTopping implements FoodItem {
    private FoodItem food;
    private Double price;

    public KetchupTopping(FoodItem food, Double price){
        this.food = food;
        this.price = price;
        this.food.getToppings().add("Ketchup");
    }

    @Override
    public String getName() {
        return this.food.getName();
    }

    @Override
    public Double getPrice() {
        return this.price + this.food.getPrice();
    }

    @Override
    public ArrayList<String> getToppings() {
        return this.food.getToppings();
    }

}