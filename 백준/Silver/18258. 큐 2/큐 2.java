
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> q = new LinkedList<>();
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<num; i++) {
            String[] op = br.readLine().split(" ");
            switch(op[0]) {
                case "push":
                    q.offer(Integer.parseInt(op[1]));
                    break;
                case "pop":
                    if(q.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(q.poll()).append("\n");
                    break;
                case "front":
                    if(q.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(q.peek()).append("\n");
                    break;
                case "back":
                    if(q.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(q.peekLast()).append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    if(q.isEmpty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
