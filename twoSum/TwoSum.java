import java.util.Arrays;

public class TwoSum {
    
    public static void twoSum(int[] nums, int target ) {
        int numsLength = nums.length;
        System.out.println(numsLength);
        for (int i = 0; i < numsLength; i++) {
            for (int j = i + 1; j < numsLength; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + ", " + j );
                }
            }
        }
    }
}
