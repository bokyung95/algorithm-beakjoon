import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int count = 0;
        int startIdx = 0; // Min
        int endIdx = N - 1; //Max

        while (startIdx < endIdx) {
            if (arr[startIdx] + arr[endIdx] < M) {
                startIdx++;
            } else if (arr[startIdx] + arr[endIdx] > M) {
                endIdx--;
            } else {
                count++;
                startIdx++;
                endIdx--;
            }
        }

        System.out.println(count);

    }
}