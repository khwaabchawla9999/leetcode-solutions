
/*
Two Sum Problem Solution

This solution uses a Hash Map (unordered_map) to efficiently find
two numbers in the array whose sum equals the target value.

Approach:
- Traverse the array once.
- For each element, calculate the required complement:
      complement = target - nums[i]
- Check if the complement already exists in the hash map.
- If found, return the indices of the two numbers.
- Otherwise, store the current number with its index in the map.

Time Complexity: O(n)
Space Complexity: O(n)

LeetCode Problem: Two Sum
*/

class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        int[] arr=new int[2];
      for (int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}
