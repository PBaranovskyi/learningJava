package ilyarogachov.homework3converter;

/**
 * Created by Tom on 25.04.2017.
 */
public class Validator {

    public boolean Validate(String valuta, double hrn) {
            if (valuta == "Hrivna"&&hrn>0){
                return true;
            } else {
                return false;
            }
    }
}
