import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Bank myBank = new Bank();

    public static void main(String[] args) {

        System.out.println("\n112.Autoboxing Challenge");

        boolean quit = true;
        printInstructions();
        while (quit) {
            System.out.println("enter your option");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> printInstructions();
                case 1 -> printCustomerList();
                case 2 -> addBranch();
                case 3 -> addCustomer();
                case 4 -> addTransaction();
                case 6 -> quit = false;
            }
        }
        scanner.close();
    }


    public static void addTransaction() {
        System.out.println("Please enter Branch name");
        String branchName = scanner.nextLine();
        System.out.println("Please enter Customer name");
        String name = scanner.nextLine();
        System.out.println("Please enter transaction");
        double trans = scanner.nextDouble();
        scanner.nextLine();
        if (!myBank.addTransaction(branchName.toUpperCase(), name.toUpperCase(), trans)) {
            System.out.println("Error adding transaction");
        }

    }

    public static void printCustomerList() {

        System.out.println("Please enter Branch name");
        String branchName = scanner.nextLine();
        if (myBank.findBranch(branchName.toUpperCase()) < 0) {
            System.out.println("Bank you entered does not exist");
            return;

        }
        System.out.println("Please enter 1 for Customer lists only");
        System.out.println("Please enter 2 for Customers lists with transactions \n");
        int option = scanner.nextInt();
        scanner.nextLine();
        if (option == 1) {
            if (!myBank.printCustomerList(branchName.toUpperCase(), 1)) {
                System.out.println("Error printing customer Lists");
            }

        } else if (option == 2) {
            if (!myBank.printCustomerList(branchName.toUpperCase(), 2)) {
                System.out.println("Error printing Customer lists with transaction");
            }
        } else {
            System.out.println("Error--Wrong option entered");
        }
    }

    public static void addBranch() {
        System.out.println("Please enter Branch name");
        String branchName = scanner.nextLine();

        if (myBank.addBranch(branchName.toUpperCase())) {
            System.out.println(branchName.toUpperCase() + " has added.");
        } else {
            System.out.println("Branch you entered already exists");
        }
    }

    public static void addCustomer() {
        System.out.println("Please enter Branch name");
        String branchName = scanner.nextLine();

        System.out.println("Please enter Customer name");
        String name = scanner.nextLine();
        System.out.println("Please enter transaction");
        double trans = scanner.nextDouble();
        scanner.nextLine();

        Customer customer = Customer.createCustomer(name.toUpperCase(), trans);
        int branchIndex = myBank.findBranch(branchName.toUpperCase());
        if (branchIndex < 0) {
            myBank.addBranch(branchName.toUpperCase());
        }
        myBank.addCustomer(branchName.toUpperCase(), customer);
    }

    public static void printInstructions() {
        System.out.println("\t 0 - to print options");
        System.out.println("\t 1 - to print Customer info ");
        System.out.println("\t 2 - to add branch");
        System.out.println("\t 3 - to add Customer");
        System.out.println("\t 4 - to add transaction with existing customer");
        //System.out.println("\t 5 - to search customer info");
        System.out.println("\t 6 - to quit application");
    }
}





/*import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Integer> intArr = new ArrayList<>();
        for(int i = 0; i <= 10; i++){
            intArr.add(Integer.valueOf(i)); //Autoboxing
        }
        for(int i = 0; i < intArr.size(); i++){
            System.out.println(i + " -> " + intArr.get(i).intValue()); //unboxing
        }


        Integer myIntValue = 56; // -> Integer.valueOf(56);
        int myInt = myIntValue; //myIntValue.intValue();

        ArrayList<Double> myDouble = new ArrayList<>();
        for(double db= 0.0; db <=10.0; db +=.5){
            myDouble.add(Double.valueOf(db)); //autoboxing
        }
        for(int i = 0; i < myDouble.size(); i++){
            System.out.println(i + " -> " + myDouble.get(i).doubleValue()); //unboxing

        }

    }

}*/