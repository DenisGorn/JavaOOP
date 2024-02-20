public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human ivan = new Human("Иван");
        Human vasya = new Human("Вася");

        market.acceptToMarket(ivan);
        market.acceptToMarket(vasya);
        market.update();

    }
}
