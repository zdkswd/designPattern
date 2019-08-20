package zdk.state;

/**
 * 作者：zdk
 * 描述：状态模式
 * 时间: 2019/8/20 9:43
*/
public class Client {
    public static void main(String[] args) {
        RaffleActivity activity=new RaffleActivity(2);

        //第一步扣除积分
        activity.deduceMoney();

        //第二步抽奖
        activity.raffle();
    }
}
