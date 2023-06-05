//Created by: Harrison Goehring
//Date: June 5th, 2023


/* Solution for the Two Sum Problem on Leet Code (Easy)
 * Given an array of integers 'nums' and an integer 'target', the
 * solution should return the indicies of the two numbers such that they add
 * up to the target value */

public class SumOfTwo {
	public int[] twoSum(int[] nums, int target) {
        int firstIndex = 0;
        int secondIndex = 0;
        int[] addToTarget = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target){
                    firstIndex = i;
                    secondIndex = j;
                    break;
                }
            }
        }

        addToTarget[0] = firstIndex;
        addToTarget[1] = secondIndex;

        return addToTarget;

    }
}
