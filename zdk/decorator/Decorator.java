package zdk.decorator;

public class Decorator extends Drink{
   private Drink obj;

    public Decorator(Drink obj) {//组合关系
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDse() {
        return super.getDse()+"&&"+obj.getDse();
    }
}
