package zdk.template;

public abstract class SoyaMilk {
    //final 不然子类去覆盖
    final void make(){
        select();
        if (wantedCondiments()){
            addCondiments();
        }
    }

    //选材料
    void select(){
        System.out.println("第一步");
    }

    //添加配料
    abstract void addCondiments();

    //钩子方法
    boolean wantedCondiments(){
        return true;
    }
}
