import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Queue<Integer> queue = new LinkedList<>();
        int last = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if ("push".equals(command)) {
                last = Integer.parseInt(st.nextToken());
                queue.add(last);
            } else if ("pop".equals(command)) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else if ("size".equals(command)) {
                sb.append(queue.size()).append("\n");
            } else if ("empty".equals(command)) {
                if (queue.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if ("front".equals(command)) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            } else {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(Integer.toString(last)).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
