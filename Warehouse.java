public class Warehouse {
    private Product[] products;
    private int count;
    private int capacity = 2000;
    private int amount;
    private int amountForPr;
    private int totalPrice;
    private int totalAmount;

    public Warehouse() {
        products = new Product[100];
        count = 0;
    }

    public void addProduct(Product product) {
        products[count++] = product;
    }

    public void removeProduct(Product product) {
        for (int i = 0; i < count; i++) {
            if (products[i].equals(product)) {
                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1];
                }
            }
            products[count - 1] = null;
            count--;
            break;
        }
    }

    public void showProduct() {
        System.out.println("Список продуктів на складі: ");
        for (int i = 0; i < count; i++) {
            System.out.print(i+1 + ".");
            products[i].aboutProduct();
        }
    }

    public void totalPrice() {
        for (int i = 0; i < count; i++) {
            totalPrice += products[i].totalPrice();
        }
        System.out.println("Загальна вартість всіх продуктів на складі: " + totalPrice);
    }

    public void totalAmount() {
        for (int i = 0; i < count; i++) {
            totalAmount += products[i].getAmount();
        }
        System.out.println("Загальна кількість всіх продуктів на складі: " + totalAmount);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setAmountForFrPr(int amount) {
        this.amountForPr = amount;
    }

    public int getAmountForPr() {
        return amountForPr;
    }
}
