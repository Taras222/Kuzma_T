import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Створюєм продукти
        Product cherry = new Product("Cherry", 35, 150);
        Product pumpkin = new Product("Pumpkin", 50, 50);
        Product strawberry = new Product("Strawberry", 22, 130);
        Product apple = new Product("Apple", 8.50, 230);

        // Створюємо продукт зі скидкою
        DiscountProduct blackberry = new DiscountProduct("Blackberry", 11.50, 0.30, 80);

        // Створюємо продукти без хімії
        Scanner sc = new Scanner(System.in);
        System.out.println("Вкажіть кількість хімікатів від 0,5 до 5: ");
        double chem = sc.nextDouble();
        System.out.println("Вкажіть кількість природніх добрив від 0,5 до 5");
        double nature = sc.nextDouble();

        ChemicFreeProduct cherryN = new ChemicFreeProduct("Cherry", cherry.getPrice() * 1.2, chem, nature, 100);
        ChemicFreeProduct pumpkinN = new ChemicFreeProduct("Pumpkin", pumpkin.getPrice() * 1.2, chem, nature, 25);
        ChemicFreeProduct strawberryN = new ChemicFreeProduct("Strawberry", strawberry.getPrice() * 1.2, chem, nature, 120);
        ChemicFreeProduct appleN = new ChemicFreeProduct("Apple", apple.getPrice() * 1.2, chem, nature, 110);

        Warehouse warehouse = new Warehouse();
        Farm farm = new Farm(chem, nature);

        farm.aboutChemAndNat();

        if (farm.productReady().equals("Плід вирощений згідно стандартів")) {
            System.out.println("Продукти допущені до продажу та надійдуть на склад");

            // Добавляємо продукти без хімії на склад
            warehouse.addProduct(cherryN);
            warehouse.addProduct(pumpkinN);
            warehouse.addProduct(strawberryN);
            warehouse.addProduct(appleN);
            warehouse.setAmountForFrPr(cherryN.getAmount() + pumpkinN.getAmount() + strawberryN.getAmount() + appleN.getAmount() + blackberry.getAmount());

            // Розраховуєм скидку
            blackberry.calcDiscount();

            warehouse.addProduct(blackberry);
        } else {
            System.out.println("Продукти не допущені до продажу");
        }


        // Добавляємо продукти на склад
        warehouse.addProduct(cherry);
        warehouse.addProduct(pumpkin);
        warehouse.addProduct(strawberry);
        warehouse.addProduct(apple);
        warehouse.setAmount(cherry.getAmount() + pumpkin.getAmount() + strawberry.getAmount() + apple.getAmount());

        // Показуємо кількість продуктів на складі
        warehouse.showProduct();

        // Показуємо загальну вартісь всіх продуктів
        warehouse.totalPrice();

        // Купляєм продукти на склад
        Product[] prodToBuy = {new Product("Cucumber", 15, 140), new Product("Tomato", 17, 100)};
        Purchase purchase = new Purchase(warehouse, prodToBuy);
        purchase.addToWarehouse();
        System.out.println("Товарів було закуплено на суму: " + purchase.totalPrice());

        // Виводимо оновлений список продуктів на складі
        warehouse.showProduct();
        warehouse.totalAmount();
        warehouse.totalPrice();

        // Продаємо продукти
        Product[] prodToSell = {cherry, strawberry, pumpkin, apple};
        Sale sale = new Sale(warehouse, prodToSell);
        sale.chooseSale();
        System.out.println("Ваш баланс: " + sale.getBalance());
    }
}