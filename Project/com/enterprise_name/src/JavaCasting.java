package Project.com.enterprise_name.src;


public class JavaCasting {
    public static void main(String[] args) {
        short x1 = 2;
        // implicit casting: x1 gets converted to int (internally).
        int y1 = x1 + 2;
        // casting occurs between compatible types
        // byte > short > int > long
        
        double x2 = 1.1;
        // 2 gets casted as double
        double y2 = x2 + 2;
        // this would mean data loss; it doesn't compile, you need to cast explicitly
        // int y3 = x2 + 2;
        // explicit casting
        int y4 = (int)x2 + 2;

        // parsing from strings
        System.out.println(Integer.parseInt("1"));
        System.out.println(Float.parseFloat("1.2"));
        

    }
}
