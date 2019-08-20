package zdk.mediator;

import java.util.HashMap;

public class ConcreteMediator extends Mediator{
    private HashMap<String,Colleague> colleagueHashMap;
    private HashMap<String,String> interMap;

    public ConcreteMediator() {
        colleagueHashMap=new HashMap<>();
        interMap=new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueHashMap.put(colleagueName,colleague);
    }


    //具体中介者的核心方法
    //1.根据得到消息，完成对应任务
    //2.中介者在这个方法协调各个具体的同时对象，完成任务
    @Override
    public void getMessage(int stateChange, String colleague) {
        if (colleagueHashMap.get(colleague) instanceof Alarm){
            if (stateChange==0){
                ((Alarm)(colleagueHashMap.get("alarm"))).startAlarm();
                System.out.println("0");
            }else {
                System.out.println("1");
            }
        }
    }

    @Override
    public void sendMessage() {

    }
}
