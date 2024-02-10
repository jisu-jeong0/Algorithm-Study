package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double grade[] = new double[n];
        double m = 0;
        double sum = 0;
        for (int i=0; i<n; i++) {
            grade[i] = Integer.parseInt(st.nextToken());
            m = Math.max(m, grade[i]);
        }
        for (int i=0; i<n; i++) {
            grade[i] = (grade[i]/m) * 100;
            sum += grade[i];
        }
        System.out.println(sum/n);
    }
}
