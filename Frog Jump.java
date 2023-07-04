//problem link-https://www.codingninjas.com/studio/problems/frog-jump_3621012?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos

//solution:
import java.util.* ;
import java.io.*; 
public class Solution {
    /*public static int f(int idx, int heights[], int dp[]){
        if(idx==0){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }

        int left=f(idx-1,heights,dp)+Math.abs(heights[idx]-heights[idx-1]);
        int right=Integer.MAX_VALUE;
        if(idx>1){
            right=f(idx-2,heights,dp)+Math.abs(heights[idx]-heights[idx-2]);
        }
        dp[idx]=Math.min(left,right);
        return dp[idx];
    }*/




    public static int frogJump(int n, int heights[]) {

        // Write your code here..
        //Tabulation approach
        /*int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return f(n-1,heights,dp);*/
       /* int dp[]=new int[n];
        Arrays.fill(dp,0);
        dp[0]=0;
        for(int i=1;i<n;i++){
            int firstStep=dp[i-1]+Math.abs(heights[i]-heights[i-1]);
            int secondStep=Integer.MAX_VALUE;
            if(i>1){
                secondStep=dp[i-2]+Math.abs(heights[i]-heights[i-2]);
            }
            dp[i]=Math.min(firstStep,secondStep);
        }
        return dp[n-1];*/
        //space optimization
        int prev=0;
        int prev2=0;
        for(int i=1;i<n;i++){
            int fs=prev+Math.abs(heights[i]-heights[i-1]);
            int ss=Integer.MAX_VALUE;

            if(i>1){
                ss=prev2+Math.abs(heights[i]-heights[i-2]);
            }
            int cur=Math.min(fs,ss);
            prev2=prev;
            prev=cur;
        }
        return prev;

    }

}
