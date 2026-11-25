class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int es = (n*(n+1))/2;
        int as = 0;
        for(int i=0;i<n;i++){
            as+=nums[i];
        }
        int res= es-as;
        return res;
        
    }
}