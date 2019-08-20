package zdk.visitor;

//新增一个wait不用增加其他代码
public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给了wait");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给了wait");
    }
}
