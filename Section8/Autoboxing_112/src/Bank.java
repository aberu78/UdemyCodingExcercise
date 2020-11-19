import java.util.ArrayList;

public class Bank {

    //private final String branch = "";
    private final ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<>();

    }

    public boolean addBranch(String branchName) {
        boolean isSuccess = false;
        if (findBranch(branchName) < 0) { //if branch does not exist
            this.branches.add(new Branch(branchName));
            isSuccess = true;
        }
        return isSuccess;

    }

    public int findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }



    public boolean addTransaction(String bankName, String customer, double trans) {
        boolean isSuccess = false;
        int branchIndex = findBranch(bankName);
        if (branchIndex >= 0) {
            int customerIndex = branches.get(branchIndex).findCustomer(customer);
            if (customerIndex >= 0) {
                if (branches.get(branchIndex).addTransaction(customer, trans)) {
                    System.out.println("Transaction added");
                    isSuccess = true;
                } else
                    System.out.println("Customer you entered does not exist in the branch");
            }
        }
        return isSuccess;
    }

    public boolean addCustomer(String branch, Customer customer) {
        int branchIndex = findBranch(branch);
        return branches.get(branchIndex).addCustomer(customer);
    }

    public boolean printCustomerList(String branch, int option) {
        boolean isSuccess = false;
        int branchIndex = findBranch(branch);
        if (branchIndex >= 0) {
            ArrayList<Customer> customerList = branches.get(branchIndex).getCustomerArr();
            for (Customer customer : customerList) {
                System.out.println("Name: " + customer.getName());
                if (option == 2) {
                    System.out.println("Transactions : " +
                            customer.getTransactions().toString());
                }
            }
            isSuccess = true;
        } else {
            System.out.println(branch + " does not exist. Error printing Customer list");
        }
        return isSuccess;
    }
}
