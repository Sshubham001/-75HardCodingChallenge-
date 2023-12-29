class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0; int r =0 ;
        while(r<nums.length-1){
            if(nums[r] != nums[r+1]){
                nums[l]=nums[r];
                l++;r++;
            }
            else r++;
        }
        nums[l]=nums[nums.length-1];
        return l+1;
    }
}