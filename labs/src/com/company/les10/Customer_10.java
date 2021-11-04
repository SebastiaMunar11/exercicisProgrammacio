package com.company.les10;

public class Customer_10 {

    int customerID = 0;
    String name = "-name required-";
    String address = "-address required-";
    String phoneNumber = "-phone required-";
    String eMail = "-email optional-";

    public void setCustomerinfo(int id, String name, String address, String phoneNumber){
        customerID = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerinfo(int id, String name, String address, String phoneNumber, String eMail){
        customerID = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMail= eMail;
    }

    public void displayCustomer(){
        System.out.println("id: " + customerID);
        System.out.println("name: " + name);
        System.out.println("address: " + address);
        System.out.println("phone number: " + phoneNumber);
        System.out.println("e-mail: " + eMail);
    }

}
