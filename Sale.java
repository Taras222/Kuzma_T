import java.util.Scanner;

public class Sale {
    private Warehouse warehouse;
    private Product[] products;
    private double balance;

    public Sale(Warehouse warehouse, Product[] products) {
        this.warehouse = warehouse;
        this.products = products;
    }

    Scanner sc = new Scanner(System.in);

    public void executeSale(Product product, int amount) {
        balance += product.getPrice() * amount;
        product.setAmount(product.getAmount() - amount);
        warehouse.removeProduct(product);
        System.out.println("Ви продали " + product.getName() + " в кількості " + amount + " за " + (product.getPrice() * amount));
    }

    public void chooseSale() {
        System.out.println("Оберіть продукт, який хочете продати: ");
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getAmount());
        }
        String name = sc.nextLine();
        Product chooseProduct = null;
        for (Product product : products) {
            if (product.getName().equals(name)) {
                chooseProduct = product;
                break;
            }
        }

        if (chooseProduct == null) {
            System.out.println("Такого продукту на складі немає");
        }

        System.out.println("Оберіть кількість, яку хочете продати: ");
        int amount = sc.nextInt();
        if (amount <= chooseProduct.getAmount()) {
            executeSale(chooseProduct, amount);
        } else {
            System.out.println("Недостатньо товару на складі");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }
}
