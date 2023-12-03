package Greedy;

import java.io.*;

class BJ_14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        int sum = -1;
        // i 5원 개수 / j 2원 개수
        for (int i = 0; 5*i <= n; i++) { 
            if ((n-5*i)%(2) == 0) {
                sum = i + (n-5*i)/(2);
            }
        }
        System.out.println(sum);

        
    }
}
