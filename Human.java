package OOPSem2Task2;

public class Human extends Actor {
    public Human(String name) {
        super(name);
    }

    @Override
    public void SetMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void SetTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    String getName() {
        return super.name;
    }
}
