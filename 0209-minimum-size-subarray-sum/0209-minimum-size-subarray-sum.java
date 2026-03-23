class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minlength = Integer.MAX_VALUE;
        for(int r=0; r < nums.length; r++){
            sum += nums[r];
        while(sum >= target){
            minlength = Math.min(minlength, r-left+1);
            sum -= nums[left];
            left++;
        }
        }
        if(minlength == Integer.MAX_VALUE) return 0;
        return minlength;
        }
    }
