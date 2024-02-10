package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// RGB거리
public class BJ_1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bufferedReader.readLine());

        // r=0, g=1, b=2
        int cost[][] = new int[n+1][3];
        int sum[][] = new int[n+1][3];

        // 각 집들의 RGB가격 저장
        // r=0, g=1, b=2
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken());
            cost[i][1] = Integer.parseInt(st.nextToken());
            cost[i][2] = Integer.parseInt(st.nextToken());
        }

        sum[0][0] = cost[0][0];
        sum[0][1] = cost[0][1];
        sum[0][2] = cost[0][2];

        // 최소값 구하기
        for (int i=1; i<n; i++) {
            sum[i][0] = Math.min(sum[i-1][1] + cost[i][0], sum[i-1][2] + cost[i][0]);   // red(0)을 고르려면 이전 집이 red가 아니어야
            sum[i][1] = Math.min(sum[i-1][0] + cost[i][1], sum[i-1][2] + cost[i][1]);
            sum[i][2] = Math.min(sum[i-1][0] + cost[i][2], sum[i-1][1] + cost[i][2]);
        }
        System.out.println(Math.min(sum[n-1][0], Math.min(sum[n-1][1], sum[n-1][2])));
        
    }
    
}
