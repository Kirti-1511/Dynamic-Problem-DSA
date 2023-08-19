//https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqa21TREptVzNZYk9MMjFCUnNsZjBxTS1JdXNfUXxBQ3Jtc0tuME5OSy1yQ1NxZG1JQ3JTZV9hTkZ6R0lmYWtRNjNEOC1wVGd3ckQxZDFvNTVXelN1dF9KSjc3dWxlTXpuYUtNNE1vYV9NWFVPNkMwRXVoTnRCaVlvc2JhTFU2Z3djZ1VRYUc5bkVrS2lXd1lNV3hvYw&q=https%3A%2F%2Fbit.ly%2F3F436dK&v=N_aJ5qQbYA0

//solution
import java.util.* ;
import java.io.*; 

public class Solution {
	public static int f(int i, int j, int[][] matrix, int[][] dp){
		if(j<0 || j>=matrix[0].length) return (int)Math.pow(-10,9);

		if(i==0) return matrix[0][j];
		if(dp[i][j]!=-1) return dp[i][j];
		int up=matrix[i][j]+f(i-1,j,matrix,dp);
		int ld=matrix[i][j]+f(i-1,j-1,matrix,dp);
		int rd=matrix[i][j]+f(i-1,j+1,matrix,dp);

		return dp[i][j]=Math.max(up,Math.max(ld,rd));
	}
	public static int getMaxPathSum(int[][] matrix) {
		// Write your code here
		int n=matrix.length;
		int m=matrix[0].length;
		int[][] dp=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				dp[i][j]=-1;
			}
		}
		int maxi=Integer.MIN_VALUE;

		//call columns of the last row
		for(int j=0;j<m;j++){
			maxi=Math.max(maxi,f(n-1,j,matrix,dp));
		   

		}
		return maxi;

		
	}
}
