/* 
* Given an array of integers nums and an integer target, 
* return indices of the two numbers such that they add up to target.
* You may assume that each input would have exactly one solution,
* and you may not use the same element twice.
* You can return the answer in any order.
*/
package Leet;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 1, 6, 4, 7, 3 };
        int[] result = getSumIndices(arr, 11);
        printArr(result);

        // para llevarlo a n log n: ordenar y luego algun tipo de binary search?
    }

    public static int[] getSumIndices(int[] myArr, int target) {
        for (int i = 0; i < myArr.length - 1; i++) {
            for (int j = i+1; j < myArr.length; j++) {
                if (myArr[i] + myArr[j] == target) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return null;
    }

    public static void printArr(int[] arr) {
        for (int i: arr) {
            System.out.println(i);
        }
    }
}
