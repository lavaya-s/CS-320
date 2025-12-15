package com.lexi.contacts;
import java.util.HashMap;

/**
 *
 * @author Lexi
 */
public class ContactService {
    private HashMap<String, Contact> contacts = new HashMap<String, Contact>();
    //The contact service shall be able to add contacts with a unique ID.
    public void addContact(String contactId, String firstName, String lastName, String phone, String address){
        contacts.put(contactId, new Contact(contactId,firstName,lastName,phone,address));
    }
    
    //The contact service shall be able to delete contacts per contact ID.
    public void deleteContact(String contactId){
        contacts.remove(contactId);
    }
    //The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
        /*firstName
        lastName
        Number
        Address*/
    public void updateFirstName(String contactId, String firstName){
        contacts.get(contactId).setFirstName(firstName);
    }
    public void updateLastName(String contactId, String lastName){
        contacts.get(contactId).setLastName(lastName);
    }
    public void updatePhone(String contactId, String phone){
        contacts.get(contactId).setPhone(phone);
    }
    public void updateAddress(String contactId, String address){
        contacts.get(contactId).setAddress(address);
    }
    public Contact getContact(String contactId){
        Contact A = contacts.get(contactId);
        return A;
    }
}
