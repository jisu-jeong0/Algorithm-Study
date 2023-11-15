package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BJ_2783 {          // 삼각 김밥

    public static void main(String[] args) throws IOException {
        // 그램 나누기 가격해서(1그램당 가격) 비교하고 제일 작은 값에 X1000
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int x0 = Integer.parseInt(st.nextToken());  // x 가격
        int y0 = Integer.parseInt(st.nextToken());  // y 그램

        double price = (double) x0/y0;

        int n = Integer.parseInt(bufferedReader.readLine());  // 편의점 개수
    
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            double price2 = (double) x/y;
            if (price2 < price) {
                price = price2;
            }
        } 
        double cheaperPrice = price*1000;
        System.out.println(cheaperPrice);
    }
}
