package za.ac.cput.Factory;

import za.ac.cput.Domain.Jet;
import za.ac.cput.util.JetHelper;

public class JetFactory {

    public static Jet jetBuilder(String regNumber, String model, int capacity){
        if (JetHelper.isNullOrEmpty(regNumber) || JetHelper.isNullOrEmpty(model)){

            return null;
        }
        return new Jet.JetBuilder()
                .setRegNumber(regNumber)
                .setModel(model)
                .setCapacity(capacity)
                .build();


    }
}
