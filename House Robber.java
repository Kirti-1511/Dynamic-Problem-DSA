//problem link-https://www.codingninjas.com/studio/problems/house-robber_839733?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos

//solution

import java.util.* ;
import java.io.*; 
public class Solution {
public static int maximumNonAdjacentSum(int[] nums){
	int n=nums.length;
		//int dp[]=new int[nums.size()+1];
		//dp[0]=nums.get(0);
		int prev=nums[0];
		int prev2=0;

		//int neg=0;
		for(int i=1;i<n;i++){
			int pick=nums[i];
			if(i>1){
				pick=nums[i]+prev2;
			}
			int notpick=0+prev;
			int curr=Math.max(pick,notpick);
			prev2=prev;
			prev=curr;

		}
		return prev;
}

	public static int houseRobber(int[] valueInHouse) {
		// Write your code here.
		int n=valueInHouse.length;
		int[] temp1=new int[n];
		int[] temp2=new int[n];
		if(n==1) return valueInHouse[0];
		for(int i=0;i<n;i++){
			if(i!=0){
				temp1[i]=valueInHouse[i];
				
			}
			if(i!=n-1){
				temp2[i]=valueInHouse[i];
			}
		}
		return Math.max(maximumNonAdjacentSum(temp1),maximumNonAdjacentSum(temp2));


		
			
	}	
}
