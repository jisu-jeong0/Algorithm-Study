package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class BJ_11047 {
    public static void main(String[] args) throws IOException {
        // k보다 작은 것 중에 제일 큰 것부터 - 그리디
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt((bufferedReader.readLine()));
        }

        int cnt = 0;
        int index = n - 1;
        while (k > 0) {
            if (coin[index] <= k) { 
                int num = k / coin[index];
                cnt += num;
                k -= num * coin[index];
            }
            index--;
        }
        System.out.println(cnt);
    }
    
}
