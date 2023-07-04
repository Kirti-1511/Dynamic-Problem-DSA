// problem link-https://www.codingninjas.com/studio/problems/maximum-sum-of-non-adjacent-elements_843261?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos

//solution
import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	/*public static int f(int ind,ArrayList<Integer> nums,int[] dp){
		if(ind==0){
			return nums.get(ind);
		
		}
		if(ind<0){
			return 0;
		}
		if(dp[ind]!=-1){
			return dp[ind];
		}
		int pick=nums.get(ind)+f(ind-2,nums,dp);
		int notpick=0+f(ind-1,nums,dp);

		dp[ind]=Math.max(pick,notpick);
		return dp[ind];
	}*/





	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
		
/*
		int n=nums.size();
		int[] dp=new int[nums.size()+1];
		Arrays.fill(dp,-1);
		//Collections.fill(dp,-1);
		return f(n-1,nums,dp);
		*/
		//Tabulation approach

		/*int n=nums.size();
		int dp[]=new int[nums.size()+1];
		dp[0]=nums.get(0);
		int neg=0;
		for(int i=1;i<n;i++){
			int pick=nums.get(i);
			if(i>1){
				pick=nums.get(i)+dp[i-2];
			}
			int notpick=0+dp[i-1];
			dp[i]=Math.max(pick,notpick);
		}
		return dp[n-1];*/
		
		//space optimization TC->O(N) SC->O(1)
		int n=nums.size();
		//int dp[]=new int[nums.size()+1];
		//dp[0]=nums.get(0);
		int prev=nums.get(0);
		int prev2=0;

		//int neg=0;
		for(int i=1;i<n;i++){
			int pick=nums.get(i);
			if(i>1){
				pick=nums.get(i)+prev2;
			}
			int notpick=0+prev;
			int curr=Math.max(pick,notpick);
			prev2=prev;
			prev=curr;

		}
		return prev;
	}
}
