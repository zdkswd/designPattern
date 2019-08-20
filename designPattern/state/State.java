package zdk.state;

public abstract class State {
    //初始化时传入活动引用，扣除积分后改变其状态
    protected RaffleActivity activity;

    //扣除积分
    public abstract void deduceMoney();

    //是否抽中奖品
    public abstract boolean raffle();

    //发放奖品
    public abstract void dispensePrize();
}
