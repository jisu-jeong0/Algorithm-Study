package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BJ_1357 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int x = Integer.parseInt(st.nextToken());  
        int y = Integer.parseInt(st.nextToken());  

        int result = rev(rev(x) + rev(y));
        System.out.println(result);
    }

    private static int rev(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
        
    }
    
}
