import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final MobilePhone mobilePhone = new MobilePhone("034 3330 4404");

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
                case 1 -> mobilePhone.printList();
                case 2 -> storeContact();
                case 3 -> modifyContact();
                case 4 -> removeContact();
                case 5 -> searchName();
                case 6 -> quit = false;
            }
        }
        scanner.close();
    }

    public static void removeContact(){
        System.out.println("Please enter name");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if(contact == null){
            System.out.println("contact not found");
            return;
        }
        if(mobilePhone.removeContact(contact))
            System.out.println("deleted.");
        else
            System.out.println("error deleting contact");

    }
    public static void searchName(){
        System.out.println("Please enter name");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if(contact == null){
            System.out.println("contact not found");
        }


    }
    public static void modifyContact() {
        System.out.println("Please enter name");
        String name = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(name);
        if(oldContact == null){
                System.out.println("contact not found");
                return;
        }
        System.out.println("Please enter new name");
        String newName = scanner.nextLine();
        System.out.println("Please enter new phone number");
        String newNum = scanner.nextLine();
        Contact newContact = new Contact(newName, newNum);
        if(mobilePhone.updateContact(oldContact, newContact))
            System.out.println("update success");
        else
            System.out.println("error updating record");
    }

    public static void storeContact(){
        System.out.println("Please enter name");
        String name = scanner.nextLine();
        System.out.println("Please enter phone number");
        String phone = scanner.nextLine();
        Contact contact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(contact)){
            System.out.println("its added");
        }

    }

    public static void printInstructions() {
        System.out.println("\t 0 - to print choice option");
        System.out.println("\t 1 - to print the list of contacts");
        System.out.println("\t 2 - to add contact to the list");
        System.out.println("\t 3 - to update a contact in the list");
        System.out.println("\t 4 - to remove a contact in the list");
        System.out.println("\t 5 - to search for a contact in the list");
        System.out.println("\t 6 - to quit application");
    }
}
