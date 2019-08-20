package zdk.visitor;

//1.这里使用了双分派，即首先在客户端程序，将具体状态作为参数传递到woman中（第一次分派）
//2.然后woman类调用作为参数的具体方法，同时将自己（this）作为参数传入（第二次分派）
public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
