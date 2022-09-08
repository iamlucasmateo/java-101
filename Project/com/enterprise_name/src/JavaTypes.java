package Project.com.enterprise_name.src;
import java.util.ArrayList;

public class JavaTypes {
    public static void main(String[] args) {
        // Primitives
        // 1 byte
        byte tinyInt = -128;
        // This won't compile
        // byte wrongTinyInt = 130;

        // 2 bytes (32K)
        short shortInt = -32700;
        
        // 4 bytes (2 billion)
        int normalInt = 2_000_000_000;

        // 8 bytes
        // Need to add the 'L' at the end; otherwise Java will see it as an int
        long longInt = 3_000_000_000L;
        
        // 4 bytes
        // Need to add 'F' at the end; otherwise Java will see it as an double
        float decimalNumber = 2.5F;

        // 8 bytes
        double pi = 3.115634854;

        // 2 bytes
        char letter = 'a';

        boolean isRainy = true;
        boolean isSunny = false;

        // Non primitive data types
        // String: double quotes
        String name = "John";
        String fullName = concatenate(name, "!");

        // classes from other files
        Animal dog = new Animal();
        String barf = dog.getBarf();

        // from libraries
        ArrayList<String> myArray = new ArrayList<String>();
        myArray.add("user1");
        myArray.add("user2");
    
    }

    // methods
    public static String concatenate(String firstString, String secondString) {
        return firstString + secondString;
    }
}