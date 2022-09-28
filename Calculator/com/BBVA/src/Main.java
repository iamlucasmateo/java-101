package Calculator.com.BBVA.src;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate what? installment, loan, totalInstallments");
        String userInput = scanner.nextLine();
        if(userInput.equals("installment")) {
            System.out.println("loan?");
            double loan = scanner.nextDouble();
            System.out.println("totalInstallments?");
            int totalInstallments = (int)scanner.nextFloat();
            System.out.println("interest rate? (periodic - effective)");
            double interestRate = scanner.nextDouble();
            double installment = Calculator.getInstallmentValue(loan, interestRate, totalInstallments);
            System.out.println("Your installment will be of: " + installment);
        } else {
            scanner.close();
            System.out.println("input not recognized");;
        }
        scanner.close();
    }
}
