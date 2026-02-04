1class Solution {
2    public void moveZeroes(int[] nums) {
3        int k=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]!=0){
6                int t=nums[i];
7                nums[i]=nums[k];
8                nums[k]=t;
9                k++;
10
11            }
12        }
13    }
14}