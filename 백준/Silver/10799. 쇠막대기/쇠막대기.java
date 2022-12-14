import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		int result = 0;

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(') {
				if (arr[i + 1] == ')') {
					result += stack.size();
					i++;
				} else {
					result++;
					stack.push('(');
				}
			} else {
				stack.pop();
			}
		}
		System.out.println(result);
	}
}