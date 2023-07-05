// Problem Link:-https://www.youtube.com/watch?v=AE39gJYuRog&list=PLgUwDviBIf0qUlt5H_kiKYaNSqJ81PMMY&index=8

//solution
public class Solution {
  //Memoisation approach
    /*public static int f(int day, int last, int[][] points, int[][] dp){
        if(day==0){
        int max=0;
        for(int task=0;task<3;task++){
            if(task!=last){
                max=Math.max(max,points[0][task]);
            }
        }
        return max;
    }
    if(dp[day][last]!=-1){
        return dp[day][last];
    }
    int max=0;
    for(int task=0;task<3;task++){
        if(task!=last){
            int point=points[day][task]+f(day-1,task,points,dp);
            max=Math.max(max,point);
        }
    }
    return dp[day][last]=max;
    

    }*/





    public static int ninjaTraining(int n, int points[][]) {

        // Write your code here..
        
        /*int[][] dp=new int[n][4];
        //Arrays.fill(dp,-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                dp[i][j]=-1;
            }
        }
        return f(n-1,3,points,dp);*/

        //Tabulation
       /* int[][] dp=new int[n][4];
        dp[0][0]=Math.max(points[0][1],points[0][2]);
        dp[0][1]=Math.max(points[0][0],points[0][2]);
        dp[0][2]=Math.max(points[0][0],points[0][1]);
        dp[0][3]=Math.max(points[0][1],Math.max(points[0][1],points[0][2]));
        
        for(int day=1;day<n;day++){
            for(int last=0;last<4;last++){
                dp[day][last]=0;
                int max=0;
                for(int task=0;task<3;task++){
                    if(task!=last){
                        int point=points[day][task]+dp[day-1][task];
                        dp[day][last]=Math.max(dp[day][last],point);

                    }
                }


                
            }
        }
        return dp[n-1][3];*/
      //space optimization approach
        int[] prev=new int[4];
        prev[0]=Math.max(points[0][1],points[0][2]);
        prev[1]=Math.max(points[0][0],points[0][2]);
        prev[2]=Math.max(points[0][0],points[0][1]);
        prev[3]=Math.max(points[0][1],Math.max(points[0][1],points[0][2]));
        
        for(int day=1;day<n;day++){
            int[]temp=new int[4];
            //instead of creating dp create temp
            for(int last=0;last<4;last++){
                temp[last]=0;
                int max=0;
                for(int task=0;task<3;task++){
                    if(task!=last){
                        //int point=points[day][task]+dp[day-1][task];
                        temp[last]=Math.max(temp[last],points[day][task]+prev[task]);

                    }
                }

              }
              prev=temp;
        }
        return prev[3];

        }
        

        }


    

}
