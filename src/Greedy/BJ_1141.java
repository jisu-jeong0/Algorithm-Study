package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class BJ_1141 {
    public static void main(String[] args) throws IOException {     // 접두사
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        HashSet<String> set = new HashSet<>();  // 중복 값 허용X
        for (int i = 0; i < n; i++) {
            set.add(bufferedReader.readLine());
        }

        int maxSubset = 0;
        for (String value1 : set) {
            boolean b = true;
            for (String value2 : set) {
                if (!value1.equals(value2) && value2.startsWith(value1)) {
                    b = false;
                    break;
                }
            } 
            if (b) { maxSubset++; }
        }
        System.out.println(maxSubset);
    }

    
}
