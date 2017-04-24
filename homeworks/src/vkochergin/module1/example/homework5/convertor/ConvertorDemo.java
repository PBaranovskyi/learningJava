package vkochergin.module1.example.homework5.convertor;

/**
 * Created by Volodymyr Kochergin on 21.04.2017.
 */
public class ConvertorDemo {
    public static void main(String[] args) {
        CurrencyConvertor convertor = new CurrencyConvertor(1.256, 26.4);
        convertor.convert();
    }
}
