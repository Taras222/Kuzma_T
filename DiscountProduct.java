public class DiscountProduct extends Product {
    private double discount;

    public DiscountProduct(String name, double price, double discount, int amount) {
        super(name, price, amount);
        this.discount = discount;
    }

    public double calcDiscount() {
        return getPrice() * (1 - discount);
    }

}
