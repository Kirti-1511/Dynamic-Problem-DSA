//problem link: https://www.codingninjas.com/studio/problems/total-unique-paths_1081470?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos&leftPanelTab=1


//solution
import java.util.* ;
import java.io.*; 
public class Solution {
	/*public static int f(int i, int j, int[][] dp){
		if(i==0 && j==0){
			return 1;
		}
		if(i<0 || j<0){
			return 0;
		}
		if(dp[i][j]!=-1) return dp[i][j];
		int up=f(i-1,j,dp);
		int left=f(i,j-1,dp);
		dp[i][j]=up+left;

		return dp[i][j];
		

	}*/

	public static int uniquePaths(int m, int n) {
		// Write your code here.
		/*int[][] dp=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				dp[i][j]=-1;
			}
		}
		return f(m-1,n-1,dp);*/
		//Tabulation

		/*int[][] dp=new int[m][n];
		//dp[0][0]=1;
		for(int i=0;i<m;i++){
			for(int j=0;i<n;j++){
				
				if(i==0 && j==0){
					dp[i][j]=1;
				} else{
					int up=0;
					int left=0;
					if(i>0) up=dp[i-1][j];
					if(j>0) left=dp[i][j-1];
					dp[i][j]=up +left;
				}
			}
		}
		return dp[m-1][n-1];*/
		


		//Another optimized solution
		int N=n+m-2;
		int r=m-1;
		double res=1;
		for(int i=1;i<=r;i++){
			res=res*(N-r+i)/i;
		}
		return (int)res;



	}
	
}
