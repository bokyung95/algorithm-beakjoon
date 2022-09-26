import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        int[] result = new int[n];

        IntStream.range(1, n + 1).forEach(queue::add); //반복문 대신

        int idx = 0;
        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.poll());
            }
            result[idx] = queue.poll();
            idx++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < result.length; i++) {
            if (i == 0) {
                sb.append(String.valueOf(result[i]));
            } else if (i < result.length) {
                sb.append(", " + String.valueOf(result[i]));
            }

        }
        sb.append(">");
        System.out.println(sb.toString());

    }
}
