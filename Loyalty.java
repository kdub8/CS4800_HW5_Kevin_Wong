public class Loyalty {
    public Double loyaltyDiscount;

    public Loyalty(Double loyaltyDiscount) {
        this.loyaltyDiscount = loyaltyDiscount;
    }

    public Double getLoyaltyDiscount() {
        return loyaltyDiscount;
    }

    public Double calculateDiscount(Order order) {
        Double discount = (order.getTotal() * this.loyaltyDiscount);
        Double total = order.getTotal() - discount;
        return total;
    }
}