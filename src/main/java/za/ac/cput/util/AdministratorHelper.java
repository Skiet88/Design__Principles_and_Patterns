package za.ac.cput.util;
import za.ac.cput.Domain.Contact;

public class AdministratorHelper {
    public static boolean isNullOrEmpty(String s){
        if (s == null || s.isEmpty()){
            return true;
        }
        return false;
    }
    public static boolean isContactNullOrEmpty(Contact contact) {
        if (contact == null) {
            return true;
        }
        return false;
    }
}
