package Greedy;    // DP도 해당

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BJ_2839 {      // 설탕 배달
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int totalBags = -1;

        for (int i = 0; i <= n / 5; i++) {
            int num = n - (5 * i);
            
            // 3으로 나누어 떨어질 경우
            if (num % 3 == 0) {
                int a = num / 3;
                totalBags = i + a;
            }
        }
        System.out.println(totalBags);
    }
    
}