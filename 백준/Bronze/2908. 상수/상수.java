import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		String str1 = sb.append(st.nextToken()).reverse().toString();
		sb.setLength(0);
		String str2 = sb.append(st.nextToken()).reverse().toString();

		String result = Integer.parseInt(str1) < Integer.parseInt(str2) ? str2 : str1;
		System.out.println(result);
	}

}