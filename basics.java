import java.util.ArrayList;

public class basics {
    public static void main(String[] args) {
        int age = 18;
        double pi = 3.14;
        long longInt = 4515483;

        // declare, not assign
        boolean isRainy;

        // assign
        isRainy = true;

        // char, single quotes
        char letter = 'a';


        // Non primitive data types
        // String: double quotes
        String name = "John";
        String fullName = concatenate(name, "!");

        // classes from other files
        Animal dog = new Animal();
        String barf = dog.getBarf();

        System.out.println("My name is " + fullName + " and I'm " + age + " years old.");
        System.out.println("My dog barfs like so: " + barf);

        // from libraries
        ArrayList<String> myArray = new ArrayList<String>();
        myArray.add("user1");
        myArray.add("user2");

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
    }

    // methods
    public static String concatenate(String firstString, String secondString) {
        return firstString + secondString;
    }
}