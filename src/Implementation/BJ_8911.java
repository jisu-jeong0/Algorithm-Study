package Implementation;

import java.io.*;

class BJ_8911 {
    public static void main(String[] args) throws IOException {        // 거북이

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            String command = bufferedReader.readLine();
            int minX = 0, minY = 0, maxX = 0, maxY = 0; 
            int x = 0, y = 0; 
            int direction = 3;   // 0: 동, 1: 서, 2: 남, 3: 북

            for (char c : command.toCharArray()) {
                if ( c == 'F' ) { 
                    if (direction == 0) x++;
                    else if (direction == 1) x--;
                    else if (direction == 2) y--;
                    else y++;
                } else if (c == 'B') {
                    if (direction == 0) x--;
                    else if (direction == 1) x++;
                    else if (direction == 2) y++;
                    else y--;
                } else if (c == 'L') {
                    if (direction == 0) direction = 3;
                    else if (direction == 1) direction = 2;
                    else if (direction == 2) direction = 0;
                    else direction = 1;
                } else if (c == 'R') {
                    if (direction == 0) direction = 2;
                    else if (direction == 1) direction = 3;
                    else if (direction == 2) direction = 1;
                    else direction = 0;
                }
                minX = Math.min(minX, x);
                minY = Math.min(minY, y);
                maxX = Math.max(maxX, x);
                maxY = Math.max(maxY, y);

        }
        int area = (maxX - minX) * (maxY - minY);
        System.out.println(area);
    }
    }
    }
    
