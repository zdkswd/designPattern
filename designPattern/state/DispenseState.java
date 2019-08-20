package zdk.state;

//发放奖品的状态
public class DispenseState extends State{
    public DispenseState(RaffleActivity activity) {
        this.activity=activity;
    }

    @Override
    public void deduceMoney() {

    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        //改变状态为奖品发放完毕
        activity.setState(activity.setDispenseOutState());
    }
}
