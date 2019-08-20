package zdk.visitor;

import java.util.LinkedList;
import java.util.List;

//数据结构，管理很多人Man，Woman
public class ObjectStructure {
    //维护一个集合
    private List<Person> people=new LinkedList<>();

    //增加到list
    public void attach(Person p){
        people.add(p);
    }

    //移除
    public void detach(Person p){
        people.remove(p);
    }

    //显示测评情况
    public void display(Action action){
        for (Person p:people){
            p.accept(action);
        }
    }


}
