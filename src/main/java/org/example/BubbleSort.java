package org.example;

/**
 * Bubble Sort algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {2, 5, 12, 43, 42, 23};
        int tmp = 0;
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 1; j <= nums.length - 1; j++) {
                if (nums[j - 1] > nums[j]) {
                    //swap the number
                    tmp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

    }
}
