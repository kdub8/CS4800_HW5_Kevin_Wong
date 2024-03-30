public class Driver {
    public static void main(String[] args) {
        FoodItem burger1 = new Burger(7.00);
        burger1 = new CheeseTopping(burger1, 0.75);
        burger1 = new SpreadTopping(burger1, .50);
        burger1 = new KetchupTopping(burger1, .25);
        System.out.println("Item 1: ");
        System.out.println(burger1.getName());
        System.out.println("$" + burger1.getPrice());

        FoodItem fries1 = new Fries(4.50);
        fries1 = new SpreadTopping(fries1, .75);
        fries1 = new KetchupTopping(fries1, .25);
        System.out.println("\nItem 2: ");
        System.out.println(fries1.getName());
        System.out.println("$" + fries1.getPrice());

        FoodItem hotdog1 = new Hotdog(2.50);
        hotdog1 = new KetchupTopping(hotdog1, .55);
        System.out.println("\nItem 3: ");
        System.out.println(hotdog1.getName());
        System.out.println("$" + hotdog1.getPrice());

        Order order = new Order();
        order.addItem(burger1);
        order.addItem(fries1);
        order.addItem(hotdog1);

        System.out.println("\nFull Order: ");
        order.printOrder();
        System.out.println("\nTotal: ");
        System.out.println("$" + order.getTotal());

        Loyalty discount = new Loyalty(.10);
        System.out.println("\nDiscount: " + (discount.getLoyaltyDiscount() * 100) + "%");
        System.out.println("New total: ");
        Double newTotal = discount.calculateDiscount(order);
        System.out.println("$" + String.format("%.2f", newTotal));
    }
}