import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int[] arr = new int[26];
		int max = 0;
		char result = '?';

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 'A']++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				result = (char)(i + 'A');
			} else if (arr[i] == max) {
				result = '?';
			}
		}
		System.out.println(result);
	}
}