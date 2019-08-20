package zdk.bridge;

public class Client {
    public static void main(String[] args) {
        Phone phone1=new FoldedPhone(new XiaoMi());
        phone1.open();
    }
}
