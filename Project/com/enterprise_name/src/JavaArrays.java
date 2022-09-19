package Project.com.enterprise_name.src;

import java.util.Arrays;


public class JavaArrays {
    public static void main(String[] args) {
        // declare array (fixed size + type)
        // items get initialized to 0 for int
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


    }
}
