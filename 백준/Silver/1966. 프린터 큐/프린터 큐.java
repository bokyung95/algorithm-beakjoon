import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static int num;
	static int m;

	public static void main(String[] args) throws IOException {

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			Queue<int[]> queue = new LinkedList<>();
			int count = 0;

			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < num; j++) {
				queue.add(new int[] {j, Integer.parseInt(st.nextToken())});
			}

			while (!queue.isEmpty()) {
				int[] temp = queue.poll();
				boolean isTrue = true;

				for (int[] q : queue) {
					if (q[1] > temp[1]) {
						isTrue = false;
					}
				}
				if (isTrue) {
					count++;
					if (temp[0] == m) {
						break;
					}
				} else {
					queue.add(temp);
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
}