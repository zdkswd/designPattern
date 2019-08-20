package zdk.absfactory;

import zdk.absfactory.Pizza;

public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("伦敦奶酪披萨");
    }
}
