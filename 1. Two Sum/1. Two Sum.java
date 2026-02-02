/*
 * Problem: 1. Two Sum
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/two-sum/submissions/1905359562/
 * Language: java
 * Date: 2026-02-02
 */

class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int len= nums.length;
        Map<Integer,Integer>checkMap=new HashMap<>();
        for(int i=0;i<len;i++)
        {
            int diff= target-nums[i];
            if(checkMap.containsKey(diff))
                return new int[]{checkMap.get(diff),i};
            checkMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
