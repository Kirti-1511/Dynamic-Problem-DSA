//https://bit.ly/3KHpP3v 

import java.util.* ;
import java.io.*; 

public class Solution{

    /*static int f(int[] weight, int[] value,int ind, int maxWeight,int[][] dp){

        if(ind==0){
            if(weight[0]<=maxWeight){
                return value[0];
            } else{
                return 0;
            }

        } 
        
        if(dp[ind][maxWeight]!=-1){
            return dp[ind][maxWeight];
        }
        int notTake=0+f(weight,value,ind-1,maxWeight,dp);
        int take=Integer.MIN_VALUE;
        if(value[ind]<=maxWeight){
            take=value[ind]+f(weight,value,ind-1,maxWeight-weight[ind],dp);

        }
        

        return dp[ind][maxWeight]=Math.max(notTake,take);

    }*/
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

            /* Your class should be named Solution
            * Don't write main().
            * Don't read input, it is passed as function argument.
            * Change in the given tree itself.
            * No need to return or print the output.
            * Taking input and printing output is handled automatically.

            */

            /*int[][] dp=new int[n][maxWeight+1];
            for (int i = 0; i < maxWeight+1; i++) {
            
               Arrays.fill(dp[i], -1);
        }
            return f(weight,value,n-1,maxWeight,dp);*/


            //using tabulation

            int[][] dp=new int[n][maxWeight+1];

            for(int i=0;i<n;i++){
                Arrays.fill(dp[i],0);
            }

            for(int i=weight[0];i<=maxWeight;i++){
                dp[0][i]=value[0];
            }
            for(int ind=1;ind<n;ind++){
                for(int W=0;W<=maxWeight;W++){
                    int notTake=0+dp[ind-1][W];
                    int take=0;
                    if(weight[ind]<=W){
                        take=value[ind]+dp[ind-1][W-weight[ind]];
                    }
                    dp[ind][W]=Math.max(take,notTake);
                }
            }
            return dp[n-1][maxWeight];


    }
}
