import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();

		for (int i = 'a'; i <= 'z'; i++) {
			sb.append(str.indexOf(i)).append(" ");
		}
		System.out.println(sb);
	}
}