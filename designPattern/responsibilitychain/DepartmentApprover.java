package zdk.responsibilitychain;

public class DepartmentApprover extends Approver{
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice()<=5000){
            System.out.println(request.getId()+this.name+"处理");
        }else {
            approver.processRequest(request);
        }
    }
}
