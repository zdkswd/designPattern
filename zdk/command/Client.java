package zdk.command;

public class Client {
    public static void main(String[] args) {
        //使用命令设计模式
        //创建电灯的对象（接受者）
        LightReceiver lightReceiver=new LightReceiver();

        //创建电灯开关命令
        LightOnCommand lightOnCommand=new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand=new LightOffCommand(lightReceiver);

        //需要一个遥控器
        RemoteController remoteController=new RemoteController();

        //给遥控器设置命令
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        remoteController.onButtonWasPushed(0);
    }
}
