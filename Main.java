package OOPSem2Task2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Азамат");
        Human human2 = new Human("Иван");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
