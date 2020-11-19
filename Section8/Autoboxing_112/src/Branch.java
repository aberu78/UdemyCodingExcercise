import java.util.ArrayList;

public class Branch {


    private final String branchName;
    private final ArrayList<Customer> customerArr = new ArrayList<>();

    public Branch(String branch) {
        this.branchName = branch;
    }

    public String getBranchName() {
        return this.branchName;
    }

    public ArrayList<Customer> getCustomerArr() {
        return this.customerArr;
    }

    public boolean addCustomer(Customer customer){
        boolean isSuccess = false;
        int index = findCustomer(customer.getName());
        if(index < 0){
            customerArr.add(customer);
            isSuccess = true;
            System.out.println("Customer added");
        }
        else{
            System.out.println("Customer already exists.");
        }
        return isSuccess;

    }

    public boolean addTransaction(String customer, double trans){
        boolean isSuccess = false;
        int index = findCustomer(customer);
        if(index >=0){
            customerArr.get(index).addTran(trans);
            isSuccess = true;
        }
        return isSuccess;
    }


    public  int findCustomer(String name){
        for(int i = 0; i < customerArr.size(); i++ ){
            if(customerArr.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

}
