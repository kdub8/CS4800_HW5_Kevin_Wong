import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestOrder {
    // Base food initialization tests
    @Test
    public void burgerTest() {
        FoodItem burgerTest = new Burger(6.0);
        Double price = burgerTest.getPrice();
        Double actualPrice = 6.0;
        assertEquals(actualPrice, price);
    }

    @Test
    public void friesTest() {
        FoodItem friesTest = new Fries(2.50);
        Double price = friesTest.getPrice();
        Double actualPrice = 2.50;
        assertEquals(actualPrice, price);
    }

    @Test
    public void hotdogTest() {
        FoodItem hotdogTest = new Hotdog(3.0);
        Double price = hotdogTest.getPrice();
        Double actualPrice = 3.0;
        assertEquals(actualPrice, price);
    }

    // Topping test
    @Test
    public void burgerToppingTest() {
        FoodItem burgerToppingTest = new Burger(6.0);
        burgerToppingTest = new CheeseTopping(burgerToppingTest, 1.50);
        Double price = burgerToppingTest.getPrice();
        Double actualPrice = 7.50;
        assertEquals(actualPrice, price);
    }

    // Order total test
    @Test
    public void getTotalTest() {
        Order order = new Order();
        FoodItem burgerTest = new Burger(6.0);
        FoodItem friesTest = new Fries(2.50);
        FoodItem hotdogTest = new Hotdog(3.0);

        order.addItem(burgerTest);
        order.addItem(friesTest);
        order.addItem(hotdogTest);

        Double price = order.getTotal();
        Double actualPrice = 11.50;
        assertEquals(actualPrice, price);
    }

    // Loyalty discount test
    @Test
    public void getDiscountTest() {
        Order order = new Order();
        FoodItem burgerTest = new Burger(6.0);
        FoodItem friesTest = new Fries(2.0);
        FoodItem hotdogTest = new Hotdog(2.0);

        order.addItem(burgerTest);
        order.addItem(friesTest);
        order.addItem(hotdogTest);

        // 10% discount
        Loyalty discount = new Loyalty(.10);

        // Total is $10, 10% discount = $1 off, new total should be $9
        Double price = discount.calculateDiscount(order);
        Double actualPrice = 9.00;
        assertEquals(actualPrice, price);
    }
}