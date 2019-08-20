package zdk.factorymethod;

import zdk.factorymethod.Pizza;


public abstract class OrderPizza {
    Pizza pizza=null;

    private String getType(){
        return "greek";
    }
    //定义一个抽象方法，createPizza,让各个工厂子类自己实现
    abstract Pizza createPizza(String pizzaType);

    public OrderPizza() {
        String orderType="";
        orderType=getType();
        pizza=createPizza(orderType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
