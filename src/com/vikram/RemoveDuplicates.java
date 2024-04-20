package com.vikram;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 1; // Pointer for the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int expectedLength1 = 2;
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedLength2 = 5;

        int k1 = removeDuplicates(nums1);
        System.out.println("Output: " + k1 + ", nums = " + Arrays.toString(nums1));
        assert k1 == expectedLength1;

        int k2 = removeDuplicates(nums2);
        System.out.println("Output: " + k2 + ", nums = " + Arrays.toString(nums2));
        assert k2 == expectedLength2;
    }
}
