import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Deque<Node> myDeque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(st.nextToken());

            while (!myDeque.isEmpty() && myDeque.getLast().value > now) {
                myDeque.removeLast();
            }
            myDeque.addLast(new Node(now, i));

            //범위에서 벗어난 값은 데크에서 제거
            if (myDeque.getFirst().index <= i - l) {
                myDeque.removeFirst();
            }
            sb.append(myDeque.getFirst().value + " ");
        }
        System.out.println(sb);

    }

    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

}
