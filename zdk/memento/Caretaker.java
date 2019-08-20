package zdk.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    //在List集合中会有很多备忘录对象
    private List<Memento> mementoList=new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    //获得到第index个Originator的备忘录对象（即保存状态）
    public Memento get(int index){
        return mementoList.get(index);
    }
}
