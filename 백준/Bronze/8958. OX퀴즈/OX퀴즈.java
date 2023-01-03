import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			sum(s);
		}
		System.out.println(sb);
	}

	public static void sum(String str) {
		int result = 1;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'O') {
				sum += result;
				result++;
			} else {
				result = 1;
			}
		}
		sb.append(sum).append("\n");
	}
}