package Project.com.enterprise_name.src;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;


public class JavaArrays {
    public static void main(String[] args) {
        System.out.println("\n**** SIMPLE (FIXED SIZE) ARRAYS ****\n\n");
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

        String[] strArr = new String[3];
        // this is null
        System.out.println(strArr[0]);

        // Arrays methods are "overloaded": implemented for many different types 

        // newer syntax: declare values explicitly
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

        /*
         * **** ARRAY LIST ****
         * This are dynamic arrays
         */
        System.out.println("\n\n**** ARRAY LISTS ****\n\n");
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

        // remove by index
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
        // slicing
        System.out.println("\nSlicing\n");

        System.out.println(toBeSorted.subList(1, 5));
        toBeSorted.sort(Comparator.naturalOrder());
        System.out.println("\nSorted\n");
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

        /*
         * LinkedList
         * 
         */
        LinkedList<Integer> myLL = new LinkedList<Integer>();

        /*
         * SETS
         * 
        */
        System.out.println("\n\n**** SETS ****\n\n");
        Set<Integer> mySet = new HashSet<Integer>(); 
        
        // This doesn't work, new Set is not an implementation
        // Set<Integer> mySet = new Set<Integer>(); 

        mySet.add(7);
        mySet.add(2);
        mySet.add(3);
        mySet.add(3);
        // O(1)
        boolean contains3 = mySet.contains(3);
        System.out.println(contains3);
        mySet.forEach(e -> {
            String stringedValue = Integer.toString(e);
            System.out.println("Unordered number " + stringedValue);
        });

        mySet.clear();
        boolean isEmpty = mySet.isEmpty();
        int setSize = mySet.size();
        mySet.remove(5);

        // Other type of sets

        // ordered in tree structure
        Set<Integer> myTreeSet= new TreeSet<Integer>();
        // linked
        Set<Integer> myLinkedSet = new LinkedHashSet<Integer>();
    }
}
