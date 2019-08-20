package zdk.state;

//不能抽奖的状态
public class NoRaffleState extends State{


    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("扣除50积分，可以抽奖了");
        this.activity.setState(activity.setCanRaffleState());
    }

    //当前状态不能抽奖
    @Override
    public boolean raffle() {
        return false;
    }

    //当前状态不能发奖品
    @Override
    public void dispensePrize() {

    }
}
