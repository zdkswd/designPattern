package zdk.factorymethod;

import zdk.factorymethod.Pizza;

public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String pizzaType) {
        Pizza pizza=null;
        if (pizzaType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if (pizzaType.equals("pepper")){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}
