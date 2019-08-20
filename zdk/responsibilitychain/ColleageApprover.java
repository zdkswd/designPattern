package zdk.responsibilitychain;

public class ColleageApprover extends Approver {
    public ColleageApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice()>5000){
            System.out.println(request.getId()+this.name);
        }else {
            approver.processRequest(request);
        }
    }
}
