package zdk.simplefactory;

import java.util.Calendar;

public class OrderPizza {
    private SimpleFactory simpleFactory;
    Pizza pizza=null;

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType="";

        this.simpleFactory = simpleFactory;

        orderType=getType();
        pizza=simpleFactory.createPizza(orderType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
    private String getType(){
        return "greek";
    }

    public OrderPizza(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }
}
