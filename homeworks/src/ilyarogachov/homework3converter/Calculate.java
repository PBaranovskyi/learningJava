package ilyarogachov.homework3converter;

import java.util.IllegalFormatException;

/**
 * Created by Tom on 25.04.2017.
 */
public class Calculate {
    private Validator f = new Validator();
    double usd;
    public double hrivnausd(String name, double hrn){
        if(f.Validate(name,hrn)){
            usd = hrn/27;
            return usd;
        } else {
            throw new IllegalArgumentException("Mazafaka ne ta valuta");
        }
    }

}
