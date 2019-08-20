package zdk.decorator;

public class Milk extends Decorator{
    public Milk(Drink obj) {
        super(obj);
        setDse("牛奶");
        setPrice(2.0f);
    }
}
