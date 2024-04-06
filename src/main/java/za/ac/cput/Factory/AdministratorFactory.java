package za.ac.cput.Factory;

import za.ac.cput.Domain.Administrator;
import za.ac.cput.Domain.Contact;
import za.ac.cput.util.AdministratorHelper;

public class AdministratorFactory {
    public Administrator buildAdministrator(String empNumber, String firstName, String lastName, String gender, Contact contact){
        if(AdministratorHelper.isNullOrEmpty(empNumber)|| AdministratorHelper.isNullOrEmpty(gender)||AdministratorHelper.isNullOrEmpty(firstName)||
                AdministratorHelper.isNullOrEmpty(lastName)||AdministratorHelper.isContactNullOrEmpty(contact)){
            return null;

        }

        return new Administrator.AdministratorBuilder()
                .setEmpNumber(empNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setGender(gender)
                .setContact(contact)
                .build();

    }
}
