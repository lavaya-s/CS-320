package com.lexi.contacts;
/**
 *
 * @author Lexi
 */
public class Contact {
    private String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    public Contact(String contactId, String firstName, String lastName, String phone, String address){
        if (contactId == null || contactId.length()>10){
            throw new IllegalArgumentException("invalid contactId");
        }
        this.contactId = contactId;
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setAddress(address);
    }
    public String getContactId(){
        return contactId;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        if (firstName == null || firstName.length()>10){
            throw new IllegalArgumentException("invalid firstName");
        }
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        if (lastName == null || lastName.length()>10){
            throw new IllegalArgumentException("invalid lastName");
        }
        this.lastName = lastName;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        if (phone == null || phone.length()!=10){
            throw new IllegalArgumentException("invalid phone");
        }
        Long.parseLong(phone);
        this.phone = phone;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        if (address == null || address.length()>30){
            throw new IllegalArgumentException("invalid address");
        }
        this.address = address;
    }
}
