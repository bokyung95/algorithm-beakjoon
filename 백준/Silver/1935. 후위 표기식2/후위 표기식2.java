import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String str = br.readLine();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Stack<Double> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			double result = 0;

			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				stack.push((double) (arr[str.charAt(i) - 'A']));
			} else {
				double b = stack.pop();
				double a = stack.pop();
				if (str.charAt(i) == '+') {
					result = a + b;
				} else if (str.charAt(i) == '-') {
					result = a - b;
				} else if (str.charAt(i) == '*') {
					result = a * b;
				} else {
					result = a / b;
				}
				stack.push(result);
			}
		}

		System.out.printf("%.2f", stack.pop());
	}
}