package tcspractice;

import java.util.Arrays;

public class duplicateArray {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                System.out.println(true); // duplicate found
            }
        }

        System.out.println(false);
    }
}
