
public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }


    public void aboutProduct() {
        System.out.println("==========================================");
        System.out.println("Ім'я: " + name);
        System.out.println("Ціна: " + price);
        System.out.println("Кількість: " + amount);
    }

    public double totalPrice() {
        return price * amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
