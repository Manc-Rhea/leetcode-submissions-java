/*
 * Problem: 55. Jump Game
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/jump-game/
 * Language: java
 * Date: 2026-02-03
 */

class Solution {

    boolean[] t= new boolean[10001];
    boolean solve(int[] nums, int len,int idx)
    {
        if(idx==len-1)
            return true;
        if(t[idx]!=false)
            return t[idx];
        for(int i=1;i<=nums[idx];i++)
        {
            if(solve(nums,len,idx+i)==true)
                return t[idx]=true;
        }
        return t[idx]=false;
    }
    public boolean canJump(int[] nums) {

        int len= nums.length;
        Arrays.fill(t,false);       //memo
        return solve(nums,len,0);   //recursion+memo
    }
}
