package zdk.state;

public class RaffleActivity {

    //表示活动当前的状态，是变化的
    State state=null;
    int count=0;

    //初始化当前状态以及奖品数量
    public RaffleActivity(int count) {
        this.count = count;
        this.state=setNoRaffleState();
    }

    //扣分
    public void deduceMoney(){
        state.deduceMoney();
    }

    //抽奖
    public void raffle(){
        //如果当前的状态是抽奖成功
        if (state.raffle()){
            //领取奖品
            state.dispensePrize();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State setNoRaffleState() {
        return new NoRaffleState(this);
    }

    public State setCanRaffleState() {
        return new CanRaffleState(this);
    }

    public State setDispenseState() {
        return new DispenseState(this);
    }

    public State setDispenseOutState() {
        return new DispenseOutState(this);
    }
}
