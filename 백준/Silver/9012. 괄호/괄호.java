import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t;
    static StringBuilder sb = new StringBuilder();
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            cnt = 0;
            String str = br.readLine();
            sb.append(isVps(str)).append("\n");
        }
        System.out.println(sb);
    }

    public static String isVps(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                cnt++;
            } else {
                if (cnt == 0) {
                    return "NO";
                } else {
                    cnt--;
                }
            }
        }
        if (cnt > 0) {
            return "NO";
        } else {
            return "YES";
        }
    }
}
