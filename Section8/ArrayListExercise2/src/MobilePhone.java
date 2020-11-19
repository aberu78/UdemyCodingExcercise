import java.util.ArrayList;

public class MobilePhone {

   // private Contact aContact;
    private String myNumber;
    private ArrayList<Contact> myArrList;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myArrList = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        myArrList.add(contact);
        return true;
    }

    private int findContact(Contact contact){
        return this.myArrList.indexOf(contact);
    }

    private int findContact(String contactName){
       for(int i = 0; i < this.myArrList.size(); i++){
           Contact contact = this.myArrList.get(i);
           if(contact.getName().equals(contactName)){
               return i;
           }
       }
        return -1;
    }

    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position>= 0){
            return this.myArrList.get(position);
        }
        return null;
    }

    public void printList(){
        if(!myArrList.isEmpty()){
            for(int i = 0; i < this.myArrList.size(); i++){
                System.out.println((i+1) + "." + this.myArrList.get(i).getName()
                        + " " + this.myArrList.get(i).getPhoneNum());
            }
        }else
            System.out.println("No contact is stored");
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println((oldContact.getName() + " was not found"));
            return false;
        }
        else{
            if(findContact(newContact.getName()) != -1){
                System.out.println("Contact with name " + newContact.getName()
                        + "already exist.. error updating ");
                return false;
            }
        }
        this.myArrList.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return  true;
    }


    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println((contact.getName() + " was not found"));
            return false;
        }
        this.myArrList.remove(contact);
        System.out.println((contact.getName() + " was removed"));
        return true;
    }


}


