package Project.com.enterprise_name.src;

import java.text.NumberFormat;


public class JavaMath {
    public static void main(String[] args){
        // Math module functions
        int rounded = Math.round(1.1F);
        System.out.println(rounded);
        
        int ceiling = (int)Math.ceil(1.1F);
        System.out.println(ceiling);

        int floor = (int)Math.floor(5.4);
        System.out.println(floor);

        double maximum = Math.max(1, 2.5);
        System.out.println(maximum);

        double randomNumber = Math.random();
        System.out.println(randomNumber);

        long chained = Math.round(Math.random() * 100);
        System.out.println(chained);

        // Number formatting
        
        // This NumberFormat class is not instantiated, it's abstract
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency);
        String result = currency.format(123457.785);
        System.out.println(currency);
        System.out.println(result);


        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        String percent1 = percentFormatter.format(0.25);
        System.out.println(percent1);
        String percent2 = percentFormatter.format(0.12);
        System.out.println(percent2);

        // chaining
        String percent3 = NumberFormat.getPercentInstance().format(3.7);
        System.out.println(percent3);

    }
}
