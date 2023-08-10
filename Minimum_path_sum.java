//https://www.codingninjas.com/studio/problems/minimum-path-sum_985349

import java.util.* ;
import java.io.*; 
public class Solution {
    //Memoisation
    /*public static int f(int i, int j, int[][] grid, int[][] dp){
    if(i==0 && j==0) return grid[0][0];
    if(i<0 || j<0) return Integer.MAX_VALUE;
    if(dp[i][j]!=-1) return dp[i][j];

    int up=f(i-1,j,grid,dp);
    int left=f(i,j-1,grid,dp);

    return dp[i][j]=Math.min(up,left)+grid[i][j];


}*/
    public static int minSumPath(int[][] grid) {
    	// Write your code here.
        int n=grid.length;
        int m=grid[0].length;
        //Memoisation
        /*int[][] dp=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }

        return f(n-1,m-1,grid,dp);*/



        //Tabulation

        int[][] dp=new int[n][m];
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0){
                    dp[i][j]=grid[0][0];
                    continue;

                }
                int up=Integer.MAX_VALUE;
                int left=Integer.MAX_VALUE;
                if(i>0){
                    up=grid[i][j]+dp[i-1][j];
                    
                }
                if(j>0){
                    left=grid[i][j]+dp[i][j-1];

                }
                dp[i][j]=Math.min(up,left);
            }
        }
        return dp[n-1][m-1];
        

        

    }
}
