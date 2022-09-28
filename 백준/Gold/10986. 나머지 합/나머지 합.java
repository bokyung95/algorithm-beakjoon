
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long result = 0;

        long[] sum = new long[n + 1];
        long[] mod = new long[m]; //나머지

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());

//            int tmp = (int)sum[i] % m;
            if ((int)(sum[i] % m) == 0) {
                result++; // 0부터 i까지 나머지가 0일경우
            }
            mod[(int)(sum[i] % m)]++;
        }


        for (int i = 0; i < m; i++) {
            if (mod[i] > 1)  {
                result = result + (long) mod[i] * (mod[i] - 1) / 2; //n개 중에 2개 구하는 공식(조합)
            }

        }

        System.out.println(result);
    }
}
