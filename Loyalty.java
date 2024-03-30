// Loyalty class for managing loyalty discounts
public class Loyalty {
    // Instance variable to store loyalty discount
    public Double loyaltyDiscount;

    // Constructor for Loyalty class
    public Loyalty(Double loyaltyDiscount) {
        // Setting the loyalty discount
        this.loyaltyDiscount = loyaltyDiscount;
    }

    // Method to get the loyalty discount
    public Double getLoyaltyDiscount() {
        // Returning the loyalty discount
        return loyaltyDiscount;
    }

    // Method to calculate discount based on loyalty status
    public Double calculateDiscount(Order order) {
        // Calculating the discount based on the order total and loyalty discount
        Double discount = (order.getTotal() * this.loyaltyDiscount);
        // Calculating the total after applying the discount
        Double total = order.getTotal() - discount;
        // Returning the total after discount
        return total;
    }
}
