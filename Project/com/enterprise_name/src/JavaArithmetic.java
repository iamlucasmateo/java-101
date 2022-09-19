package Project.com.enterprise_name.src;

public class JavaArithmetic {
    public static void main(String[] args){
        int oneNumber = 10;
        int otherNumber = 3;
        // this only gets the integer part
        int division = oneNumber / otherNumber;
        System.out.println(division);

        // this will convert to double but not have the decimal part
        double result = 10 / 3;
        System.out.println(result);
        // for that we need to type cast the original values
        double resultOk = (double)10 / (double)3;
        System.out.println(resultOk);

        // increment
        otherNumber += 5;
        int prefixIncrement = oneNumber++;
        System.out.println(prefixIncrement);
        System.out.println(oneNumber);
        System.out.println(otherNumber);
        int postfixIncrement = ++oneNumber;
        System.out.println(postfixIncrement);
        System.out.println(oneNumber);

        // other augmented or compound assignment operators
        otherNumber -= 3;
        System.out.println(otherNumber);
    }
}
