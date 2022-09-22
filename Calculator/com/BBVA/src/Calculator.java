package Calculator.com.BBVA.src;

public class Calculator {
    // to check https://www.areadepymes.com/?tit=calculadora-de-la-cuota-y-cuadro-de-amortizacion-de-un-prestamo&name=Simuladores&fid=cf0bcao
    
    public static double getInstallmentValue(
        double amount, 
        double interestRate, 
        int totalInstallments
    )
    {
        double factor = getFactor(totalInstallments, interestRate);
        return amount * factor;
    }

    public static double getTotalValue(int totalInstallments, double installmentValue, double interestRate) {
        double factor = getFactor(totalInstallments, interestRate);

        return installmentValue / factor;
    }

    public static double getFactor(int totalInstallments, double interestRate) {
        double numerator = Math.pow((1+interestRate), totalInstallments) * interestRate;
        double denominator = Math.pow((1+interestRate), totalInstallments) - 1;
        
        return numerator / denominator;
    }

    public static int getTotalInstallments(double amount, double interestRate, double installmentValue) {
        // Full equation c = v * (i / (1 - (1+i)**-n))
        
        // v * i / c
        double rhs = (amount * interestRate) / installmentValue;
        // 1 - rhs = (1+i)**-n
        double step2 = 1 - rhs;
        // ln step2 / ln(1+i) = -n
        int n = (int)-(Math.log(step2) / Math.log((1 + interestRate))); 

        return n;
    }
}
