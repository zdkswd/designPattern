package zdk.absfactory;

import zdk.absfactory.Pizza;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("北京奶酪披萨");
    }
}
