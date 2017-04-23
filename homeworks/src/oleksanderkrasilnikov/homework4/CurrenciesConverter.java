package oleksanderkrasilnikov.homework4;

public class CurrenciesConverter {

    private double rate;
    CurrenciesConverter(double rate){
        this.rate = rate;
    }

    public double convert(double amount){
       return amount/rate;
    }

    public static void main(String[] args) {
        CurrenciesConverter amount = new CurrenciesConverter(26.8);
        System.out.println(amount.convert(26800));
    }
}
