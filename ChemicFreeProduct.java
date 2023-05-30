public class ChemicFreeProduct extends Product {
    private double chemicUsage;
    private double natureUsage;
    private String category;

    public ChemicFreeProduct(String name, double price, double chemicUsage, double natureUsage, int amount) {
        super(name, price, amount);
        this.chemicUsage = chemicUsage;
        this.natureUsage = natureUsage;
    }

    public void aboutProduct() {
        super.aboutProduct();
        System.out.println("Використано хімікатів: " + chemicUsage);
        System.out.println("Використано природніх добрив: " + natureUsage);
        productCategory();
        System.out.println("==========================================");
    }

    public void productCategory() {
        if (chemicUsage <= 3.2) {
            category = "A";
            System.out.println("Категорія продукту: " + category);
        } else if (chemicUsage >= 3.2 && chemicUsage <= 4){
            category = "B";
            System.out.println("Категорія продукту: " + category);
        } else {
            category = "C";
            System.out.println("Категорія продукту: " + category);
        }
    }



    public double getChemicUsage() {
        return chemicUsage;
    }

    public void setChemicUsage(double chemicUsage) {
        this.chemicUsage = chemicUsage;
    }

    public double getNatureUsage() {
        return natureUsage;
    }

    public void setNatureUsage(double natureUsage) {
        this.natureUsage = natureUsage;
    }

}
