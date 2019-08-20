package zdk.absfactory;

import java.util.Calendar;

public class OrderPizza {
    private AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;
        Pizza pizza=null;
        String orderType="";//用户输入
        //可能是北京的工厂子类，也可能是伦敦的工厂子类
        pizza=absFactory.createPizza(orderType);
        if (pizza!=null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }else {
            System.out.println("订购失败");
        }

    }
}
