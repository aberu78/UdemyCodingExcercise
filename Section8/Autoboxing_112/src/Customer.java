import java.util.ArrayList;

public class Customer {

    private final ArrayList<Double> transactions = new ArrayList<>();
    private final String name;

    public Customer(String name, double trans) {
        this.transactions.add(trans);
        this.name = name;
    }

    public static Customer createCustomer(String name, double trans) {
        return new Customer(name, trans);
    }

    public void addTran(double trans) {
        this.transactions.add(trans);
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public String getName() {
        return this.name;
    }
}
