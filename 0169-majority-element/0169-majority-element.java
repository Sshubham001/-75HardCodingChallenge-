class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length<=1)return nums[0];
        Arrays.sort(nums);
        int count =0;
        int numCount =1;
        int majorityNum = Integer.MIN_VALUE;
        int idx =0;

        while(idx<nums.length-1){
            if(nums[idx] == nums[idx+1]){
                 numCount++;
                if(idx==nums.length-2 && numCount>count){
                    count =numCount;
                    majorityNum=nums[idx];
                }
            }else{
                if(numCount>count){
                    count =numCount;
                    majorityNum=nums[idx];
                    numCount=1;
                }
            }
            idx++;
        }
        return majorityNum;
    }
}