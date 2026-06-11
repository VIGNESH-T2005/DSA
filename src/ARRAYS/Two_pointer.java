package ARRAYS;
// sorted array

import java.util.*;

public class Two_pointer {

    static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target)
                return new int[]{left + 1, right + 1}; // 1-indexed
            else if (sum < target)
                left++;
            else
                right--;
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        
        int[] nums = {2, 7, 11, 15};
        int target=9;
        int[] result= twoSum(nums,target);
        System.out.println(Arrays.toString(result));
     
       
    }
}