import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<int[]> deque = new ArrayDeque<>();

		for (int i = 1; i <= n; i++) {
			deque.addLast(new int[] {i, Integer.parseInt(st.nextToken())});
		}

		while (deque.size() > 1) {
			int[] temp = deque.pollFirst();
			sb.append(temp[0]).append(" ");
			if (temp[1] > 0) {
				for (int i = 1; i < temp[1]; i++) {
					deque.addLast(deque.pollFirst());
				}
			} else {
				for (int i = 0; i < -temp[1]; i++) {
					deque.addFirst(deque.pollLast());
				}
			}
		}
		System.out.println(sb.append(deque.poll()[0]));
	}
}