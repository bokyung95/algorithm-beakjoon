import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            Stack<Character> stack = new Stack<>();
            char[] arr = br.readLine().toCharArray();
            boolean isVps = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == '(') {
                    stack.push(arr[j]);
                } else {
                    if (stack.isEmpty()) {
                        sb.append("NO").append("\n");
                        isVps = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (isVps && stack.isEmpty()) {
                sb.append("YES").append("\n");
            } else if (!stack.isEmpty()) {
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}