package Project.com.enterprise_name.src;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;


public class JavaArrays {
    public static void main(String[] args) {
        // declare array (fixed size + type)
        // items get initialized to 0 for int
        // this arrays cannot be resized
        int[] numbers = new int[5];
        
        // set
        numbers[0] = 1;
        numbers[0] = 12;

        // this prints out the memory address
        System.out.println(numbers);

        // this prints as expected
        System.out.println(Arrays.toString(numbers));

        // Arrays methods are "overloaded": implemented for many different types 

        // newer syntax
        int[] newNumbers = { 2, 3, 5, 1, 4 };
        int length = newNumbers.length;
        System.out.println(length);

        // sorts in place
        Arrays.sort(newNumbers);
        System.out.println(Arrays.toString(newNumbers));

        // setting wrong index
        try {
            numbers[7] = 12;
        } catch(Exception exc) {
            System.out.println(exc);
        }

        // multidimensional arrays
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[1][1] = 2;
        matrix[2][2] = 3;
        System.out.println(Arrays.deepToString(matrix));

        int [][] initializedMatrix = { {1, 0, 0}, {0, 2, 0}, {0, 0, 3} };
        System.out.println(Arrays.deepToString(initializedMatrix));


        // ArrayList
        ArrayList<Integer> myArrList = new ArrayList<Integer>();
        // Integer is the reference type form, wrapper for int; you need to use that for ArrayList
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(3);
        System.out.println(myArrList);
        System.out.println(myArrList.get(2));
        try {
            // this raise an exception
            myArrList.get(5);
        } catch(Exception exc) {
            System.out.println(exc);
        }

        // remove byu index
        myArrList.remove(2);
        System.out.println(myArrList);
        myArrList.add(4);
        System.out.println(myArrList);
        // remove by value
        myArrList.remove(Integer.valueOf(2));
        System.out.println(myArrList);

        // set index 1 => 30
        myArrList.set(1, 30);
        System.out.println(myArrList);

        ArrayList<Integer> toBeSorted = new ArrayList<Integer>();
        toBeSorted.add(5);
        toBeSorted.add(4);
        toBeSorted.add(2);
        toBeSorted.add(7);
        toBeSorted.add(1);

        toBeSorted.sort(Comparator.naturalOrder());
        System.out.println(toBeSorted);

        int arrLength = toBeSorted.size();
        boolean has2 = toBeSorted.contains(2);
        System.out.println(toBeSorted.isEmpty());

        toBeSorted.forEach(number -> {
            // can use the same variable name here (no duplicate local variable issue)
            int index = toBeSorted.indexOf(number);
            toBeSorted.set(index, number * 2);
        });
        System.out.println(toBeSorted);
    }
}
