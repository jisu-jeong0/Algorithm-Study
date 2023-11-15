package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

class BJ_12865 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(st.nextToken());  
        int k = Integer.parseInt(st.nextToken()); 

        int[] weights = new int[n];
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int w = Integer.parseInt(st.nextToken());  
            int v = Integer.parseInt(st.nextToken()); 

            weights[i] = w;
            values[i] = v; 
        }
            
        int[][] dp = new int[n + 1][k + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= k; w++) {
                if (weights[i - 1] < w) {
                    dp[i][w] = Math.max(dp[i - 1][w], values[i - 1] + dp[i - 1][w - weights[i - 1]]);
                } else if (weights[i - 1] == w) {
                    dp[i][w] = values[i - 1] + dp[i - 1][w - weights[i - 1]];
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        System.out.println(dp[n][k]);
    }
}
