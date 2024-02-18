public class Main {
    public static void main(String[] args) {
        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine();
        machine.addProduct(new BottleOfWater("Вода1", 100, 5));
        machine.addProduct(new BottleOfWater("Вода2", 10, 0.5));
        machine.addProduct(new BottleOfWater("Вода3", 1, 1));
        machine.addProduct(new BottleOfWater("Вода4", 1000, 500));
        printProductByName(machine, "Вода1");
        printProductByCost(machine, 1000);

        HotDrinkMachine hdMachine = new HotDrinkMachine();
        hdMachine.addProduct(new HotDrink("Кофе", 100, 300, 95));
        hdMachine.addProduct(new HotDrink("Чай", 50, 250, 90));
        hdMachine.addProduct(new HotDrink("Какао", 70, 200, 75));
        printProductByName(hdMachine, "Кофе");
        printProductByCost(hdMachine, 70);
        printProductByAllParameters(hdMachine, "Какао", 200, 75);

    }

    public static void printProductByName(VendingMachine vendingMachine, String name) {
        System.out.println(vendingMachine.getProduct(name));
    }

    public static void printProductByCost(VendingMachine vendingMachine, double cost) {
        System.out.println(vendingMachine.getProduct(cost));
    }

    public static void printProductByAllParameters(VendingMachine vendingMachine, String name, double volume, int temperature) {
        System.out.println(((HotDrinkMachine) (vendingMachine)).getProduct(name, volume, temperature));
    }
}
