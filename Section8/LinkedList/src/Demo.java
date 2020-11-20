import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Alabama");
        addInOrder(placesToVisit, "Georgia");
        addInOrder(placesToVisit, "Florida");
        addInOrder(placesToVisit, "North Carolina");
        addInOrder(placesToVisit, "South Carolina");
        addInOrder(placesToVisit, "D.C");
        addInOrder(placesToVisit, "New York");

        printList(placesToVisit);
        addInOrder(placesToVisit, "New York");
        addInOrder(placesToVisit, "South Dakota");
        printList(placesToVisit);
        visit(placesToVisit);

//
//        placesToVisit.add("Alabama");
//        placesToVisit.add("Georgia");
//        placesToVisit.add("Florida");
//        placesToVisit.add("North Carolina");
//        placesToVisit.add("D.C");
//        placesToVisit.add("New York");
//
//        printList(placesToVisit);
//        placesToVisit.add(1, "Kentucky");
//        printList(placesToVisit);
//        placesToVisit.remove(4);
//        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==============================");
    }
    //to order alphabetically
    private static boolean addInOrder(LinkedList<String> linkedList, String state){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(state);
            if(comparison == 0){
                System.out.println(state + " is already included as destination");
                return false;
            }else if(comparison>0){
                stringListIterator.previous(); //go one iterator back
                stringListIterator.add(state);
                return true;
            }else if(comparison  < 0){
                //move on to next state
            }
        }
        stringListIterator.add(state);
        return true;
    }

    private static void visit(LinkedList states){
        boolean goingForward = true;
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = states.listIterator();

        if(states.isEmpty()){
            System.out.println("No states in the itinerary");
            return;
        }else{
            System.out.println("Now visiting" + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                    case 0:
                    System.out.println("holiday (Vacation) over");
                    quit = true;
                    break;
                case 1: {
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting" + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                }
                case 2: {
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting" + listIterator.previous());
                    }else {
                        System.out.println("we are at the start of the list");
                        goingForward = true;
                    }
                }
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Option below");
        System.out.println("0 - to quit  \n" +
                "1 - to next state  \n" +
                "2 - go to previous state  \n" +
                "3 - print menu option  \n");
    }
}
