import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		int last = 0;
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			switch(command) {
			case "push" :
				last = Integer.parseInt(st.nextToken());
				q.offer(last);
				break;
			case "pop" :
				if(q.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(q.poll());
                }
				break;
			case "size" :
                System.out.println(q.size());
				break;
			case "empty" :
				if(q.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
				break;
			case "front" :
                if(q.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(q.peek());
                }
				break;
			case "back" :
                if(q.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(last);
                }
				break;
			}
		}
	}
	
}