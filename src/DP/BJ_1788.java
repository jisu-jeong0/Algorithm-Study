package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1788 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int fib[] = new int[Math.abs(n)+1];
        
        fib[0] = 0;
        fib[1] = 1;
        
        if (n>=2) {
            for (int i=2; i<=n; i++) {
                fib[i] = (fib[i-1] + fib[i-2]) % 1000000000;
            }
        }
        else if (n<=-2) {
            for (int i=2; i<=Math.abs(n); i++) {
                fib[i] = (fib[i-2] - fib[i-1] + 1000000000) % 1000000000;
            }
        }
        int res = fib[Math.abs(n)];
        if (n > 0) {
            System.out.println(1);
        } else if (n == 0) {
            System.out.println(0);
        } else {
            System.out.println(n%2 == 0 ? -1 : 1);
        }
        System.out.println(Math.abs(res)%1000000000); 
    }
}
