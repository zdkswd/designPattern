package zdk.decorator;

public class Chocolate extends Decorator{
    public Chocolate(Drink obj) {
        super(obj);
        setDse("巧克力");
        setPrice(3.0f);
    }
}
