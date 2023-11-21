package Math;

import java.io.*;
import java.util.*;

class BJ_1712 {
    public static void main(String[] args) throws IOException {
        // A 매년 발생하는 고정비용
        // B 노트북 한 대당 발생 비용
        // C 노트북 가격
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        // 지출 : a+bi  
        // 수익: ci
        // a+bi < ci 될 때 i 개수 출력
        // 손익분기점 없으면 -1 출력
        int i;
        if ( b >= c ) {
            i = -1;
        } else {
            i = (a)/(c-b) + 1;
        } 
        System.out.println(i);

    }
    
}
