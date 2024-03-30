// Importing JUnit assert methods for testing
import static org.junit.Assert.assertEquals;

// Importing JUnit test annotation
import org.junit.Test;

// Test class for the Order class
public class TestOrder {
    // Test method for checking the initialization of a Burger object
    @Test
    public void burgerTest() {
        // Creating a Burger object with a price of $8.79
        FoodItem burgerTest = new Burger(8.79);
        // Getting the price of the Burger object
        Double price = burgerTest.getPrice();
        // Expected price for the Burger object
        Double actualPrice = 8.79;
        // Verifying that the actual price matches the expected price
        assertEquals(actualPrice, price);
    }

    // Test method for checking the initialization of a Fries object
    @Test
    public void friesTest() {
        // Creating a Fries object with a price of $3.59
        FoodItem friesTest = new Fries(3.59);
        // Getting the price of the Fries object
        Double price = friesTest.getPrice();
        // Expected price for the Fries object
        Double actualPrice = 3.59;
        // Verifying that the actual price matches the expected price
        assertEquals(actualPrice, price);
    }

    // Test method for checking the initialization of a Hotdog object
    @Test
    public void hotdogTest() {
        // Creating a Hotdog object with a price of $4.69
        FoodItem hotdogTest = new Hotdog(4.69);
        // Getting the price of the Hotdog object
        Double price = hotdogTest.getPrice();
        // Expected price for the Hotdog object
        Double actualPrice = 4.69;
        // Verifying that the actual price matches the expected price
        assertEquals(actualPrice, price);
    }

    // Test method for checking the addition of a topping to a Burger object
    @Test
    public void burgerToppingTest() {
        // Creating a Burger object with a price of $3.99
        FoodItem burgerToppingTest = new Burger(3.99);
        // Adding a Cheese topping to the Burger object
        burgerToppingTest = new CheeseTopping(burgerToppingTest, 1.00);
        // Getting the price of the Burger object with the topping
        Double price = burgerToppingTest.getPrice();
        // Expected price for the Burger object with the topping
        Double actualPrice = 4.99;
        // Verifying that the actual price matches the expected price
        assertEquals(actualPrice, price);
    }

    // Test method for checking the calculation of the total price of an order
    @Test
    public void getTotalTest() {
        // Creating an Order object
        Order order = new Order();
        // Creating FoodItem objects for a Burger, Fries, and Hotdog
        FoodItem burgerTest = new Burger(7.00);
        FoodItem friesTest = new Fries(3.45);
        FoodItem hotdogTest = new Hotdog(4.50);

        // Adding the FoodItem objects to the Order
        order.addItem(burgerTest);
        order.addItem(friesTest);
        order.addItem(hotdogTest);

        // Getting the total price of the Order
        Double price = order.getTotal();
        // Expected total price of the Order
        Double actualPrice = 14.95;
        // Verifying that the actual total price matches the expected total price
        assertEquals(actualPrice, price);
    }

    // Test method for checking the calculation of a loyalty discount
    @Test
    public void getDiscountTest() {
        // Creating an Order object
        Order order = new Order();
        // Creating FoodItem objects for a Burger, Fries, and Hotdog
        FoodItem burgerTest = new Burger(14.65);
        FoodItem friesTest = new Fries(5.78);
        FoodItem hotdogTest = new Hotdog(5.69);

        // Adding the FoodItem objects to the Order
        order.addItem(burgerTest);
        order.addItem(friesTest);
        order.addItem(hotdogTest);

        // Creating a Loyalty object with a 20% discount
        Loyalty discount = new Loyalty(.20);

        // Calculating the discounted total price of the Order
        Double price = discount.calculateDiscount(order);
        // Expected discounted total price of the Order
        Double actualPrice = 20.896;
        // Verifying that the actual discounted total price matches the expected discounted total price
        assertEquals(actualPrice, price);
    }
}
