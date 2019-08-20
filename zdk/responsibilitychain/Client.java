package zdk.responsibilitychain;

public class Client {
    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest request=new PurchaseRequest(1,3000,1);

        //创建相关的审批人
        DepartmentApprover departmentApprover=new DepartmentApprover("系级");
        ColleageApprover colleageApprover=new ColleageApprover("院级");

        //需要将各个审批级别设置好(处理人构成环形/单链的化要从第一个人调用)
        departmentApprover.setApprover(colleageApprover);
        colleageApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(request);
    }
}
