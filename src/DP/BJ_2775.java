package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        int dp[][] = new int[15][15];

        // 0층
        for (int n=1; n<15; n++) { dp[0][n] = n; }

        for (int m=0; m<t; m++) {
            int k = Integer.parseInt(bufferedReader.readLine());
            int n = Integer.parseInt(bufferedReader.readLine());

            // dp[k][n] = dp[k-1][n] + dp[k][n-1]
            for (int i=1; i<=k; i++) { 
                for (int j=1; j<=n; j++) { 
                    if (j==1) { dp[i][j] = dp[i-1][j]; }
                    else { dp[i][j] = dp[i-1][j] + dp[i][j-1]; }
            }
            }
            System.out.println(dp[k][n]);  
        }
    
    }
}