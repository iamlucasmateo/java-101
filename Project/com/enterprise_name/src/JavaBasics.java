package Project.com.enterprise_name.src;

import java.util.ArrayList;

public class JavaBasics {
    public static void main(String[] args) {
        // sout Tab (shortcut)
        System.out.println("Hello, World");

        // declare variable
        int age = 18;

        // declare, not assign
        boolean isRainy;

        // assign
        isRainy = true;

        // declare multiple values
        int myAge = 18, temperature = 34;

        // Non primitive data types
        // String: double quotes
        String name = "John";
        String fullName = concatenate(name, "!");

        // classes from other files
        Animal dog = new Animal();
        String barf = dog.getBarf();

        System.out.println("My name is " + fullName + " and I'm " + age + " years old.");
        System.out.println("My dog barfs like so: " + barf);

        // Assigning variables values to variables
        int yourAge = age;
        System.out.println("Just assigned variable: " + yourAge);
        
        // reassign variable
        age = 25;
        System.out.println("After changing original variable: " + yourAge);

        // from libraries
        ArrayList<String> myArray = new ArrayList<String>();
        myArray.add("user1");
        myArray.add("user2");

        char letter = 'a';

        System.out.println("Testing if/else branching");
        if(letter == 'a') {
            for (int i = 0; i <= myArray.lastIndexOf("user2"); i++) {
                System.out.println(myArray.get(i));
            }
        } else if(letter == 'b') {
            System.out.println("second branch");
        } else {
            System.out.println("last branch");
        }

        int j = 0;
        while(j < 3){
            System.out.println("Testing while loop: " + j);
            j = j + 1;
        }

        try {
            throw new Exception("Something went wrong");
        } catch(Exception e) {
            System.out.println(e);
        }

        // constants
        final float PI = 3.14F;
        // this causes a compilation error
        // PI = 1;
    }

    // methods
    public static String concatenate(String firstString, String secondString) {
        return firstString + secondString;
    }
}