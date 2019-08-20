package zdk.absfactory;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza=null;
        if (pizzaType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if (pizzaType.equals("pepper")){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}
