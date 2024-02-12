package DP;

import java.io.*;

// 피보나치 함수
public class BJ_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        int[] t0 = new int[41];
        int[] t1 = new int[41];
        t0[0] = t1[1] = 1;
        t0[1] = t1[0] = 0;
        for (int i=0; i<tc; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j=2; j<=n; j++) {
                // 바닥에서부터 더해서 올라가야 함 m=6은 m=5의 횟수와 m=4의 횟수를 더하면 돼
                t0[j] = t0[j-1] + t0[j-2];
                t1[j] = t1[j-1] + t1[j-2];
            }
            System.out.println(t0[n] + " " + t1[n]);
        }
    }
}
