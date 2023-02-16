import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int min = Integer.MAX_VALUE;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (temp < min) {
				min = temp;
			}
			arr[i] = temp;
		}

		for (int i = 1; i <= min; i++) {
			if (n == 2) {
				if (arr[0] % i == 0 && arr[1] % i == 0) {
					sb.append(i).append("\n");
				}
			} else {
				if (arr[0] % i == 0 && arr[1] % i == 0 && arr[2] % i == 0) {
					sb.append(i).append("\n");
				}
			}
		}

		System.out.println(sb);

	}
}