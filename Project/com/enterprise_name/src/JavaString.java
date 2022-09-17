package Project.com.enterprise_name.src;

public class JavaString {

    public static void main(String[] args) {
        // string literal to instantiate, instead of new String
        String message = "Hello World";
        
        int length = message.length();
        System.out.println(length);

        boolean ends1 = ends(message, "rld");
        System.out.println(ends1);
        
        boolean ends2 = ends(message, "other");
        System.out.println(ends2);

        System.out.println(message.startsWith("He"));

        // index of characters
        System.out.println("");
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("l"));
        System.out.println(message.indexOf("x"));
        
        // This creates a new String (Strings are immutable)
        System.out.println("");
        System.out.println(message.replace("el", "xy"));

        message.trim();

        // escape sequences
        String escaped = "Hello \"Lucas\"";
        System.out.println(escaped);
        System.out.println("");
        System.out.println("Hello \nLucas");

    }

    public static boolean ends(String word, String ending) {
        return word.endsWith(ending);
    }
    
}
