import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < n; i++) {
            long find = arr[i];
            int start = 0;
            int end = n - 1;
            while (start < end) {
                if (arr[start] + arr[end] > find) {
                    end--;
                } else if (arr[start] + arr[end] < find) {
                    start++;
                } else {
                    if (start == i) {
                        start++;
                    } else if (end == i) {
                        end--;
                    } else {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}