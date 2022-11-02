/*
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 */

package Playground.com.me.src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;


public class Leet3Sum {
 public static void main(String[] args) {
    Leet3Sum obj = new Leet3Sum();
    Integer[] nums1 = {-1, 0, 1, 2, -1, -4};
    HashSet<Integer[]> result1 = obj.get3Sum(nums1);
    System.out.println(obj.stringify(result1));

    Integer[] nums2 = {0, 1, 1};
    HashSet<Integer[]> result2 = obj.get3Sum(nums2);
    System.out.println(obj.stringify(result2));

    Integer[] nums3 = {0, 0, 0};
    HashSet<Integer[]> result3 = obj.get3Sum(nums3);
    System.out.println(obj.stringify(result3));
 }

 private HashSet<Integer[]> get3Sum(Integer[] nums) {
    if (nums.length < 3) {
        return new HashSet<Integer[]>();
    }
    HashSet<Integer[]> results = new HashSet<Integer[]>();
    for (int i = 0; i < nums.length - 2; i++) {
        for (int j = i+1; j < nums.length - 1; j++) {
            for (int k = j+1; k < nums.length; k++) {
                if ((nums[i] + nums[j] + nums[k] == 0)) {
                    Integer[] result = { nums[i], nums[j], nums[k] }; 
                    if (!arrayExists(results, result)) {
                        results.add(result);
                    }
                }
            }
        }
    }
    return results;
 }

 private boolean arrayExists(HashSet<Integer[]> mySet, Integer[] myArr) {
    HashMap<Integer, Integer> arrCounts = getCounts(myArr);  
    for (Integer[] nums: mySet) {
        HashMap<Integer, Integer> counts = getCounts(nums);
        if (arrCounts.equals(counts)) return true;
    }
    return false;
 }

 private HashMap<Integer, Integer> getCounts(Integer[] myArr) {
    HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
    for (int num: myArr) {
        if (counts.keySet().contains(num)) {
            counts.put(num, counts.get(num) + 1);
        } else {
            counts.put(num, 1);
        }
    }
    return counts;
 }

 private String stringify(HashSet<Integer[]> mySet) {
    String result = "[ ";
    for (Integer[] numbers: mySet) {
        result += "[";
        for (int n: numbers) {
            result += n + ",";
        }
        result += "], ";
    }
    result += " ]";
    
    return result;
 }
}
