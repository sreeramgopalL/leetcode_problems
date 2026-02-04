1class Solution {
2    public int removeDuplicates(int[] nums) {
3
4        if (nums.length == 0) {
5            return 0;
6        }
7
8        int k = 1;
9
10        for (int i = 1; i < nums.length; i++) {
11            if (nums[i] != nums[i - 1]) {
12                nums[k] = nums[i];
13                k++;
14            }
15        }
16
17        return k;
18    }
19}
20