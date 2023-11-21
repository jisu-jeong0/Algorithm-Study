package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BJ_1934 {     // 최소공배수
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        int[] result = new int[n];
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 1. 최대공약수
            if (a == 1) { result[i] = b; }
            else {
                int gcd = GCD(a, b);
                result[i] = (a*b)/gcd;
            }
        }

        for (int i=0; i<n; i++) {
            System.out.println(result[i]);
        }
    }
    
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
    }
    

