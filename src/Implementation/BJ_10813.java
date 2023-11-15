package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BJ_10813 {     // 공 바꾸기
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int n0 = Integer.parseInt(st.nextToken());  
        int m0 = Integer.parseInt(st.nextToken());  

        int[] arr = new int[n0];
        for (int i=0; i < n0; i++) {
            arr[i] = i+1;
        }

        for (int j = 0; j < m0; j++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int temp = arr[n-1];
            arr[n-1] = arr[m-1];
            arr[m-1] = temp;
        }

        for (int num = 0; num < arr.length; num++) {
            System.out.print(arr[num] + " ");
        }

    }
    
}