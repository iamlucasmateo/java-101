package Project.com.enterprise_name.src;

import java.util.Date;
import java.awt.Point;

public class JavaReference {
    public static void main(String[] args) {
        // if it's not a primitive, it's a reference
        // this allocates memory for the reference
        Date myDate = new Date();
        // methods
        myDate.getTime();
        
        // Difference between references and primitives
        byte x = 1;
        byte y = x;
        System.out.println(x);
        System.out.println(y);
        x = 2;
        System.out.println(x);
        System.out.println(y);

        // point1 and point2 point to the same address in memory
        Point point1 = new Point(2, 5);
        Point point2 = point1;
        System.out.println(point1);
        System.out.println(point2);

        // the reference has changed, now they both change
        point1.x = 12;
        point1.y = -5;
        System.out.println(point1);
        System.out.println(point2);

        // point1 now points to a different address in memory
        point1 = new Point(3, 7);
        System.out.println(point1);
        System.out.println(point2);
    }
}
