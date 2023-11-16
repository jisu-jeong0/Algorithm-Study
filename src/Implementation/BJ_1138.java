package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BJ_1138 {       // 한 줄로 서기
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] str = bufferedReader.readLine().split(" ");

        int[] line = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = Integer.parseInt(str[i]);     // height
            for (int j = 0; j < n; j++) {
                if (cnt == 0 && line[j] == 0) {   
                    line[j] = i + 1;
                    break;
                }
                if (line[j] == 0 || line[j] > i + 1) {
                    cnt--; 
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(line[i] + " ");
        }
    }
}