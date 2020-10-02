package com.addressbook;

public class AddressBook {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    long zip;
    long phoneNumber;
    public AddressBook(String firstName,String lastName,String address,String city,String state,long zip,long phoneNumber)
    {
     this.firstName = firstName;
     this.lastName = lastName;
     this.address = address;
     this.city = city;
     this.state = state;
     this.zip = zip;
     this.phoneNumber = phoneNumber;
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to addressbook");
        
    }

}
