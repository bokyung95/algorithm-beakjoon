import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] result = new int[n + m];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			result[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = n; i < n + m; i++) {
			result[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(result);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < result.length; i++) {
			sb.append(result[i]).append(" ");
		}
		System.out.println(sb);
	}

}