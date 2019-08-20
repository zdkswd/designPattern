package zdk.state;

//奖品发放完毕状态，当状态改变为DispenseOutState,抽奖活动结束
public class DispenseOutState extends State{
    public DispenseOutState(RaffleActivity activity) {
        this.activity=activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("奖品发放完毕");
    }

    @Override
    public boolean raffle() {
        return false;
    }

    @Override
    public void dispensePrize() {

    }
}
