package ltretykhlib.module3;

/**
 * Created by Tretykhlib on 23.04.2017.
 */
public class Currency {

    private double rate;

    public Currency(double convertRate) {
        rate = convertRate;
    }


    public double convert(int uahAmount) {
        double usdAmount = uahAmount / rate;
        System.out.println("Amount in USD: " + usdAmount);
        return usdAmount;
    }

}



