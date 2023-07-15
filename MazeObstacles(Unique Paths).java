//problem link:-https://www.codingninjas.com/studio/problems/maze-obstacles_977241?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos&leftPanelTab=3
//solution

import java.util.ArrayList;

public class Solution {
    static int mod=1000000007;
    static int mazeObstacles(int n, int m, ArrayList<ArrayList<Integer>> mat) {
        // Write your code here.
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat.get(i).get(j)==-1){
                    dp[i][j]=0;
                } else if(i==0 && j==0){
                    dp[i][j]=1;
                } else{
                    int up=0;
                    int left=0;
                    
                    if(i>0) up=dp[i-1][j];
                    if(j>0) left=dp[i][j-1];
                    dp[i][j]=(up+left)%mod;
                }
            }
        }
        return dp[n-1][m-1];
    }

}
