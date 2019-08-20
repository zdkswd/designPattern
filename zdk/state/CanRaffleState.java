package zdk.state;

import java.util.Random;

//可以抽奖的状态
public class CanRaffleState extends State{
    public CanRaffleState(RaffleActivity activity) {
        this.activity=activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("以及扣除了积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖");
        Random random=new Random();
        int num= random.nextInt(10);
        if (num==0){
            //改变活动状态为发放奖品
            activity.setState(activity.setDispenseState());
            return true;
        }else {
            //改变状态为不能抽奖
            activity.setState(activity.setNoRaffleState());
            return false;
        }

    }

    @Override
    public void dispensePrize() {
        System.out.println("没有中奖，不能发放奖品");
    }
}
