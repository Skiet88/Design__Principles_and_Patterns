package za.ac.cput.util;

import java.time.LocalDate;

public class JetHelper {
    public static boolean isNullOrEmpty(String s){
        if (s == null || s.isEmpty()){
            return true;
        }
        return false;
    }
    private  static boolean isDateNull(LocalDate date){
        if(date == null){
            return true;
        }
        return false;
    }
}
