import java.util.ArrayList;

public class CheeseTopping implements FoodItem {
    private FoodItem food;
    private Double price;

    public CheeseTopping(FoodItem food, Double price){
        this.food = food;
        this.price = price;
        this.food.getToppings().add("Cheese");
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