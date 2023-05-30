public class Purchase {
    private Warehouse warehouse;
    private Product[] products;

    public Purchase(Warehouse warehouse, Product[] products) {
        this.warehouse = warehouse;
        this.products = products;
    }

    public void addToWarehouse() {
        for (Product product : products) {
            warehouse.addProduct(product);
        }
    }

    public double totalPrice() {
        double price = 0.0;
        for (Product product : products) {
            price += product.getPrice() * product.getAmount();
        }
        return price;
    }


    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
