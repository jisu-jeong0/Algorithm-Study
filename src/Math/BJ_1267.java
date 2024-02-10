package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1267 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        
        int sumY = 0;
        int sumM = 0;
        for (int i=0; i<n; i++) {
            int k = Integer.parseInt(st.nextToken());
            sumY += ((k/30) + 1) * 10;
            sumM += ((k/60) + 1) * 15;
        }
        
        if (sumY < sumM) {
            System.out.println("Y " + sumY);
        } else if (sumY > sumM) {
            System.out.println("M " + sumM);
        } else {
            System.out.println("Y M " + sumY);
        }
        
    }
}
