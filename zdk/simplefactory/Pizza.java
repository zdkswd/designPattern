package zdk.simplefactory;

public abstract class Pizza {
    public abstract void prepare();

    public void bake(){
        System.out.println("烘焙");
    }

    public void cut(){
        System.out.println("切割");
    }

    public void box(){
        System.out.println("打包");
    }
}
