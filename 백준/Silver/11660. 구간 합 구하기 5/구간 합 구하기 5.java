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

        int[][] arr = new int[n+1][n+1];
        int[][] sum = new int[n+1][n+1];

        int result = 0;



        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < n + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + arr[i][j];
            }
        }

//        for(int[] a : arr){
//            for(int b : a ) {
//                System.out.print(b + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for(int[] a : sum){
//            for(int b : a ) {
//                System.out.print(b + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            result = sum[x2][y2] - sum[x1-1][y2] -sum[x2][y1-1] + sum[x1-1][y1-1];
            System.out.println(result);
        }


    }
}