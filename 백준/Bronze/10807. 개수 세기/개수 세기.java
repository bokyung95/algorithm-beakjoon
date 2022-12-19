import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		int result = 0;
		int v = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			if (v == Integer.parseInt(st.nextToken())) {
				result++;
			}
		}
		System.out.println(result);
	}
}