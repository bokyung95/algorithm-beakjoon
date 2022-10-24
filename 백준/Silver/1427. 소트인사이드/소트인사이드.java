import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int[] arr = new int[n.length()];

        for (int i = 0; i < n.length(); i++) {
            arr[i] = Integer.parseInt(n.substring(i, i + 1));
        }

        //선택정렬
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            if (arr[i] < arr[max]) {
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }

        for (int i = 0; i < n.length(); i++) {
            System.out.print(arr[i]);
        }

    }
}