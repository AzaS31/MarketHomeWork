package OOPSem2Task2;
public abstract class Actor implements ActorBehavior{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    abstract String getName();

    public Actor(String name){
        this.name = name;
    }
}
