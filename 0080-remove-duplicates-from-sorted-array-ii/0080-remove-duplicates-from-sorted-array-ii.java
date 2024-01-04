class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (i < 2 || nums[i] != nums[j - 2]) {
                nums[j++] = nums[i++];
            } else
                i++;
        }
        return j;
    }
    
}