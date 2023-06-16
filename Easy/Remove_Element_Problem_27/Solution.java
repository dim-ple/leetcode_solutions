/* Solution Submitted by Harrison Goehring
 * Date of Submission: June 16th, 2023
 * 
 * Given an integer array of 'nums' and an integer of 'val', this algorithm will remove all occurences of 'val' in nums.
 * The algortihm then returns the number of elements in the 'nums' array which are not equal to our 'val' integer.
 */

class Solution {

    public int removeElement(int[] nums, int val) {
        
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        
        return counter;

    }
}