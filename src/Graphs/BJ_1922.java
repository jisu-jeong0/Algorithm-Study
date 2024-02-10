package Graphs;

import java.io.*;
import java.util.*;

class BJ_1922 {
    static final int INF = 987654321;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] com = new int[n+1][n+1];
        
        // 초기 배열 지정 - 연결점이 없는 선은 INF로, 1에서 1은 0
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                com[i][j] = INF;
                com[i][i] = 0;
            }
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            com[a][b] = c;
        }

        // 플로이드-와샬 알고리즘
        // 시작점 i, 도착점 j, 경유점 k
        // adj[i][j]=MIN(adj[i][j], adj[i][k]+adj[k][j])
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    com[i][j] = Math.min(com[i][j], com[i][k] + com[k][j]);
                }
            }
        }

        int result = INF;
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            cnt = 0;
            for (int j = 1; j <= n; j++) {
                cnt = cnt + com[i][j];
            }
            if ( result > cnt ) { 
                result = cnt;
            } // cnt 동일한 경우 숫자 적은 사람 출력
        }
        System.out.println(cnt);


        
    }
    
}
