package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2579 {
    public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
 
		int score[] = new int[n + 1];
        int sum[] = new int[n + 1];
 
		for (int i = 1; i <= n; i++) {
			score[i] = Integer.parseInt(bufferedReader.readLine());
		}
 
		sum[1] = score[1];
		
		if (n >= 2) { sum[2] = score[1] + score[2]; }
		for (int i = 3; i <= n; i++) {
			sum[i] = Math.max(sum[i - 2] , sum[i - 3] + score[i - 1]) + score[i];
		}
		System.out.println(sum[n]);
	}
}
