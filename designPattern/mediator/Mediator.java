package zdk.mediator;

public abstract class Mediator {
    //将中介者对象加入到集合中
    public abstract void register(String colleagueName,Colleague colleague);

    //接收消息，具体的同事发出
    public abstract void getMessage(int stateChange,String colleague);

    public abstract void sendMessage();
}
