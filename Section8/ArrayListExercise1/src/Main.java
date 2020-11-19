import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        System.out.println("\n107.ArrayList Challenge part3");
        System.out.println("\n107.ArrayList Challenge part2");
        System.out.println("\n107.ArrayList Challenge part1");

        boolean quit = true;
        printInstructions();
        while (quit) {
            System.out.println("enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> printInstructions();
                case 1 -> groceryList.printGroceryList();
                case 2 -> addItem();
                case 3 -> modifyItem();
                case 4 -> removeItem();
                case 5 -> searchForItem();
                case 6 -> processArrayList();
                case 7 -> quit = false;
            }
        }
    }
    public static void processArrayList(){
        ArrayList<String> newArr = new ArrayList<>();
        newArr.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArr = new ArrayList<String> (groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

    public static void searchForItem() {
        System.out.println("Enter to search for ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery");
        } else {
            System.out.println("Item you entered not found");
        }
    }

    public static void removeItem() {
        System.out.println("Please enter an item to remove");
        String item = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void modifyItem() {

        System.out.println("Enter an item  you want to modify");
        String oldItem = scanner.nextLine();
        System.out.println("Enter replacement item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(oldItem, newItem);
    }

    public static void addItem() {
        System.out.println("Please enter an grocery items");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void printInstructions() {
        System.out.println("\t 0 - to print choice option");
        System.out.println("\t 1 - to print the list of grocery items");
        System.out.println("\t 2 - to add an items to the list");
        System.out.println("\t 3 - to modify an item in the list");
        System.out.println("\t 4 - to remove an item in the list");
        System.out.println("\t 5 - to search for an item in the list");
        System.out.println("\t 6 - to quit application");
    }
}
