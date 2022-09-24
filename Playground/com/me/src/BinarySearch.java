package Playground.com.me.src;


public class BinarySearch {
    public static void main(String[] args) {
        int[] example = {12, 14, 16, 17, 23, 25, 26, 28, 34, 36, 38};
        System.out.println(findIndex(example, 27));
    }

    public static int findIndex(int[] array, int element) {
        int rightIndex = array.length;
        return findIndexBetween(array, element, 0, rightIndex);
    }

    public static int findIndexBetween(int[] array, int element, int leftIndex, int rightIndex) {
        if (rightIndex == leftIndex) { 
            if (array[rightIndex] != element) {
                return -1;
            } else {
                return rightIndex;
            }
        }
        int middleIndex = ((rightIndex - leftIndex) / 2) + leftIndex;
        int middleValue = array[middleIndex];
        if (middleValue == element) {
            return middleIndex;
        } else if (middleValue > element) {
            int newRightIndex = middleIndex - 1;
            return findIndexBetween(array, element, leftIndex, newRightIndex);
        } else if (middleValue < element) {
            int newLeftIndex = middleIndex + 1;
            return findIndexBetween(array, element, newLeftIndex, rightIndex);
        } else {
            return -1;
        }

    }
}
