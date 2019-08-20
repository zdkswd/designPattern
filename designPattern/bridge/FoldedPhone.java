package zdk.bridge;

//继承抽象类Phone
public class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    /**
     * 作者：zdk
     * 描述：桥接模式
     * 桥在于例如
     * FoldedPhone.open()->Phone.open()->Phone.brand.open()
     * 真正实现open的是实现brand接口的类。
     * 时间: 2019/8/13 16:10
    */
    public void open(){
        super.open();
        System.out.println("折叠手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠手机");
    }
}
