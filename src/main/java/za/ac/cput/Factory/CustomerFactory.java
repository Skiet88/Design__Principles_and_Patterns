package za.ac.cput.Factory;

import za.ac.cput.Domain.Administrator;
import za.ac.cput.Domain.Contact;
import za.ac.cput.Domain.Customer;
import za.ac.cput.util.CustomerHelper;

public class CustomerFactory {
    public static Customer buildCustomer(String customerNumber, String firstName, String lastName, String gender, Contact contact){
        if(CustomerHelper.isNullOrEmpty(customerNumber)|| CustomerHelper.isNullOrEmpty(gender)||CustomerHelper.isNullOrEmpty(firstName)||
                CustomerHelper.isNullOrEmpty(lastName)||CustomerHelper.isContactNullOrEmpty(contact)){
            return null;

        }

        return new Customer.CustomerBuilder()
                .setcustomerNumber(customerNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setGender(gender)
                .setContact(contact)
                .build();

    }
}
