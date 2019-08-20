package zdk.absfactory;

import zdk.absfactory.LDCheesePizza;
import zdk.absfactory.LDPepperPizza;

public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza=null;
        if (pizzaType.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if (pizzaType.equals("pepper")){
            pizza=new LDPepperPizza();
        }
        return pizza;
    }
}
