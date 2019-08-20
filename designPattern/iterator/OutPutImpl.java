package zdk.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
    //学院集合
    List<Colleage> colleageList;

    public OutPutImpl(List<Colleage> colleageList) {
        this.colleageList = colleageList;
    }

    //遍历学院
    public void printColleage(){
        //Java List已经实现了Iterator
        Iterator<Colleage> iterator=colleageList.iterator();

        while (iterator.hasNext()){
            Colleage colleage=iterator.next();
            printDepartment(colleage.createIterator());
        }
    }

    //输出学院的系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department d=(Department)iterator.next();
            System.out.println(d.getName());
        }
    }
}
