package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BJ_22864 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 24 행동 가능
        // m을 넘으면 break, a는 쌓이는 피로도 b는 일한 분량
        // c는 줄어드는 피로도
        // 1. a가 m보다 크지 않을 떄까지 반복문 일한 분량 sum
        // 2. c만큼 쉬고 줄어든 피로도 > a보다 높으면 일하기 
        int work = 0;
        int tired = 0;
        for (int i = 0; i < 24; i++) {
            if ( tired + a <= m ) {
                work += b;
                tired += a;
            } else {
                if ( tired - c < 0 ) { tired = 0; }
                else { tired -= c; }
            }
        }
        System.out.println(work);
}
}
