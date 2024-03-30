// Driver class to demonstrate the use of the food ordering system
public class Driver {
    public static void main(String[] args) {
        System.out.println("Decorator Design Pattern for Restaurant Order System by Kevin Wong\n");
        // Creating a burger with initial price
        FoodItem burger1 = new Burger(7.30);
        // Adding cheese topping to the burger
        burger1 = new CheeseTopping(burger1, 0.75);
        // Adding spread topping to the burger
        burger1 = new SpreadTopping(burger1, .50);
        // Adding ketchup topping to the burger
        burger1 = new KetchupTopping(burger1, .25);
        // Displaying details of item 1 (burger)
        System.out.println("Item 1: ");
        System.out.println(burger1.getName());
        System.out.println("$" + burger1.getPrice());

        // Creating fries with initial price
        FoodItem fries1 = new Fries(4.50);
        // Adding spread topping to the fries
        fries1 = new SpreadTopping(fries1, .75);
        // Adding ketchup topping to the fries
        fries1 = new KetchupTopping(fries1, .25);
        // Displaying details of item 2 (fries)
        System.out.println("\nItem 2: ");
        System.out.println(fries1.getName());
        System.out.println("$" + fries1.getPrice());

        // Creating a hotdog with initial price
        FoodItem hotdog1 = new Hotdog(2.50);
        // Adding ketchup topping to the hotdog
        hotdog1 = new KetchupTopping(hotdog1, .55);
        // Displaying details of item 3 (hotdog)
        System.out.println("\nItem 3: ");
        System.out.println(hotdog1.getName());
        System.out.println("$" + hotdog1.getPrice());

        // Creating a 2nd burger with initial price
        FoodItem burger2 = new Burger(14.35);
        // Adding cheese topping to the burger
        burger2 = new CheeseTopping(burger2, 1.50);
        // Adding spread topping to the burger
        burger2 = new SpreadTopping(burger2, 0.85);
        // Adding ketchup topping to the burger
        burger2 = new KetchupTopping(burger2, 0.50);
        // Displaying details of item 4 (burger2)
        System.out.println("\nItem 4: ");
        System.out.println(burger2.getName());
        System.out.println("$" + burger2.getPrice());

        // Creating an order and adding items to it
        Order order = new Order();
        order.addItem(burger1);
        order.addItem(fries1);
        order.addItem(hotdog1);
        order.addItem(burger2);

        // Displaying the full order
        System.out.println("\nFull Order: ");
        order.printOrder();
        // Displaying the total cost of the order
        System.out.println("\nTotal: ");
        System.out.println("$" + order.getTotal());

        // Creating a loyalty discount of 20%
        Loyalty discount = new Loyalty(.20);
        // Displaying the loyalty discount percentage
        System.out.println("\nDiscount: " + (discount.getLoyaltyDiscount() * 100) + "%");
        // Calculating and displaying the new total after discount
        System.out.println("New total: ");
        Double newTotal = discount.calculateDiscount(order);
        System.out.println("$" + String.format("%.2f", newTotal));
    }
}
