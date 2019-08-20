package zdk.simplefactory;
/**
 * 作者：zdk
 * 描述：简单工厂类
 * 时间: 2019/8/11 14:16
*/
public class SimpleFactory {
    public Pizza createPizza(String pizzaType){
        Pizza pizza=null;
        if (pizzaType.equals("greek")){
            pizza=new GreekPizza();
        }else if (pizzaType.equals("cheese")){
            pizza=new CheesePizza();
        }
        return pizza;
    }
}
