package zdk.memento;
/**
 * 作者：zdk
 * 描述：备忘录模式
 * 时间: 2019/8/19 15:19
*/
public class Client {
    public static void main(String[] args) {
        Originator originator=new Originator();
        Caretaker caretaker=new Caretaker();

        originator.setState("1");

        //保存了当前状态
        caretaker.add(originator.saveStateMemento());

        originator.setState("2");

        caretaker.add(originator.saveStateMemento());

        //恢复到1
        originator.getStateFromMemento(caretaker.get(0));
    }
}
