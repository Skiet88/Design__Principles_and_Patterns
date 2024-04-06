package za.ac.cput.Factory;

import za.ac.cput.util.ContactHelper;
import za.ac.cput.Domain.Contact;

public class ContactFactory {
    public static Contact buildContact(String phoneNumber, String emailAddress, String address) {

        if(ContactHelper.isNullOrEmpty(phoneNumber)||ContactHelper.isNullOrEmpty(emailAddress)||ContactHelper.isNullOrEmpty(address)){
            return null;
        }

        return new Contact.ContactBuilder()
                .setPhoneNumber(phoneNumber)
                .setEmailAddress(emailAddress)
                .setAddress(address)
                .build();
    }
}
