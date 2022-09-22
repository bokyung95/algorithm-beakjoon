import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if ('(' == str.charAt(j)) {
                    stack.push('(');
                } else {
                    if (stack.isEmpty()) {
                        stack.push(')');
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            stack.clear();
        }
    }
}
