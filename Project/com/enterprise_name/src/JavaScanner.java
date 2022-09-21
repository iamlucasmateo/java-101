package Project.com.enterprise_name.src;

import java.util.Scanner;


public class JavaScanner {
    public static void main(String[] args) {
        // Taking input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age?");
        byte age = scanner.nextByte();
        // returns a String
        // scanner.next();
        // returns a float
        // scanner.nextFloat();
        // returns full line
        // scanner.nextLine();
        System.out.println("You are " + age);
        scanner.close();
    }
}
