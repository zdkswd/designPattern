package zdk.decorator;

public abstract class Drink {
    public String dse;//描述
    private float price=0.0f;

    public String getDse() {
        return dse;
    }

    public void setDse(String dse) {
        this.dse = dse;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    //计算费用的抽象方法
    //子类实现
    public abstract float cost();
}
