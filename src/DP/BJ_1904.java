package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1904 {   // 01타일
    public static void main(String[] args) throws IOException {

        // n=1이면 1
        // n=2, 00 11
        // n=3, 001, 100, 111
        // n=4, 0011, 1001, 0000, 1100, 1111
        // n=5, 00001, 00100, 10000, 11100, 10011, 11001, 00111, 11111
        // n=6, 000000, 001001, 001100, 000011, 100100, 100001, 110000 ....

        // 피보나치 수열
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        int[] dp = new int[Math.max(n + 1, 3)];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        } 

        System.out.println(dp[n]);
    }
}
