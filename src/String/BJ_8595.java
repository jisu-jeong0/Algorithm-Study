package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BJ_8595 {        // 히든 넘버

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String word = bufferedReader.readLine();

        long sum = 0;
        String num = "";

        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                num += c;
            } else {
                if (!num.isEmpty()) {
                    sum += Long.parseLong(num);
                    num = "";
                }
            }
        }
        if (!num.isEmpty()) {
            sum += Long.parseLong(num);
        }
        System.out.println(sum);
    }
}