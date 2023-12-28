class Solution {
    public int missingNumber(int[] nums) {
        // int sum = (nums.length*(nums.length+1))/2;
        // for(int i: nums){
        //     sum -=i;
        // }
        // return sum;
/**        
Follow up: can you solve this by any other approach  using only O(1) extra space complexity and O(n) runtime complexity?
*/ 
        int xorAll=0;
        for(int i = 0 ; i <= nums.length ; i++){
         xorAll ^= i;
        }

        for(int i : nums){
            xorAll ^=i;
        }
        return xorAll;
    
    }
}