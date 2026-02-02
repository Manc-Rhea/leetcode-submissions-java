/*
 * Problem: 55. Jump Game
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/jump-game/
 * Language: java
 * Date: 2026-02-02
 */

class Solution {
    public boolean canJump(int[] nums) {

        int len= nums.length;
        int maxReachable = 0;  //greedy
        for(int i=0;i<len;i++)
        {
            if(i > maxReachable)
                return false;
            maxReachable= Math.max(maxReachable,i+nums[i]);
        }
        return true;
    }
}
