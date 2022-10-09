package Project.com.enterprise_name.src;

public class ControlFlow {
    public static void main(String[] args) {
        // Comparison operators
        System.out.println(2 == 1+1);
        System.out.println(2 != 2);
        System.out.println(3 > 2);
        // false && true, false; Java short circuits this
        System.out.println(2 == 3 && 2 != 2);
        // true or false, Java short circuits to true 
        System.out.println(2 == 2 || 2 != 2);
        System.out.println(!false);

        // Comparing strings
        System.out.println("Comparing strings");
        String stringy = "stringy";
        System.out.println(stringy == "stringy");
        System.out.println(stringy.equals("stringy"));

        // if and variable declaration
        if (2 == 2) {
            // this is only available inside the block scope
            boolean someBoolean = true;
        }
        // this cannot be resolved
        // System.out.println(someBoolean);
        // declare variable beforehand
        boolean someBoolean;
        if (2 == 2) {
            someBoolean = true;
        }

        // ternary operator
        int income = 20_000;
        String clientType = income > 100_000 ? "economy" : "high";
        
        // switch statement
        String result = getGreeting("admin");
        System.out.println(result);

        String result2 = getGreeting("moderator");
        System.out.println(result2);

        String result3 = getGreeting("person");
        System.out.println(result3);
        
        int[] fizzBuzzArgs = {15, 21, 25, 22};
        for (int i = 0; i < fizzBuzzArgs.length; i++) {
            System.out.println(fizzBuzz(fizzBuzzArgs[i]));
        }

        // forEach
        for (int arg : fizzBuzzArgs) {
            System.out.println(arg);
        }
    }

    public static String getGreeting(String role) {
        String result;
        switch (role) {
            case "admin":
                result = "You are admin";
                break;
            case "moderator":
                result = "You are moderator";
                break;
            default:
                result = "You are guest";
        }
        return result;
    }

    public static String fizzBuzz(int input) {
        boolean isDivisibleBy3 = isDivisible(input, 3);
        boolean isDivisibleBy5 = isDivisible(input, 5);
        if (isDivisibleBy3 && isDivisibleBy5) {
            return "FizzBuzz";
        } else if (isDivisibleBy3) {
            return "Fizz";
        } else if (isDivisibleBy5) {
            return "Buzz";
        } else {
            return "None";
        }
    }

    public static boolean isDivisible(int input, int divisor) {
        // casting to get correct results
        float divisionResult = (float)input / (float)divisor;
        int divisionInt = (int)divisionResult;
        return ((float)divisionInt - divisionResult) == 0.0;
    }
}
