import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        // 자릿수가 한개인 소수는 2,3,5,7 이므로
        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);

        System.out.println(sb.toString());

    }

    static void dfs(int checkNum, int digit) { //숫자, 자릿수
        if (digit == n) {
            if (isPrime(checkNum)) {
                sb.append(checkNum + "\n");
            }
            return;
        }

        for (int i = 1; i < 10; i++) { //1~9까지 (xx1, xx3)
            if (i % 2 == 0) {
                continue;
            }
            if (isPrime(checkNum * 10 + i)) { //소수라면
                dfs(checkNum * 10 + i, digit + 1);
            }
        }
    }

    static boolean isPrime(int checkNum) {
        for (int i = 2; i <= checkNum / 2; i++) {
            if (checkNum % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
