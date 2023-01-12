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
		int x = Integer.parseInt(st.nextToken());
		int[] arr = new int[n + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = arr[i -1] + Integer.parseInt(st.nextToken());
		}

		int max = 0;
		int cnt = 0;
        
		for (int i = x; i < n + 1; i++) {
			int cur = arr[i] - arr[i - x];
			if (cur > max) {
				max = cur;
				cnt = 0;
			}

			if (max == cur) {
				 cnt++;
			}
		}


		if (max == 0) {
			System.out.println("SAD");
		} else {
			System.out.println(max);
			System.out.println(cnt);
		}
	}

}
