package zdk.mediator;

public class Alarm extends Colleague{
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在创建Alarm同事对象时，将自己放入ConcreteMediator对象集合中
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void startAlarm(){

    }
}
