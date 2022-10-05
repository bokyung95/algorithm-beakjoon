import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] checkArr;
    static int[] myCheckArr;
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()); //전체 문자열 크기
        int P = Integer.parseInt(st.nextToken()); // 부분 문자열 크기
        int result = 0; //정답
        checkArr = new int[4]; //비밀번호 체크 배열
        myCheckArr = new int[4]; //내 문자열 비밀번호 체크 배열
        char[] arr = new char[S]; // 전체 문자열 배열
        checkSecret = 0; //몇개가 비밀번호 조건에 맞는가 (checkSecret이 4가 될 경우 result++ 해주면 됨)

        arr = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) { //0일 경우 해당 문자열은 없어도 됨
                checkSecret++;
            }
        }

        for (int i = 0; i < P; i++) { //부분문자열 처음 받을때 세팅
            add(arr[i]);
        }

        if (checkSecret == 4) {
            result++;
        }

        //슬라이딩 윈도우 (한칸 슬라이딩 한 상태부터 시작)
        for (int i = P; i < S ; i++) { //부분문자열 끝
            int j = i - P; // 부분문자열 처음
            add(arr[i]);
            remove(arr[j]);
            if (checkSecret == 4) {
                result++;
            }
        }

        System.out.println(result);
        br.close();

    }

    private static void remove(char arr) {
        switch (arr) {
            case 'A':
                if (myCheckArr[0] == checkArr[0]) {
                    checkSecret--;
                }
                myCheckArr[0]--;
                break;
            case 'C':
                if (myCheckArr[1] == checkArr[1]) {
                    checkSecret--;
                }
                myCheckArr[1]--;
                break;
            case 'G':
                if (myCheckArr[2] == checkArr[2]) {
                    checkSecret--;
                }
                myCheckArr[2]--;
                break;
            case 'T':
                if (myCheckArr[3] == checkArr[3]) {
                    checkSecret--;
                }
                myCheckArr[3]--;
                break;
        }
    }

    private static void add(char arr) {
        switch (arr) {
            case 'A':
                myCheckArr[0]++;
                if (myCheckArr[0] == checkArr[0]) {
                    checkSecret++;
                }
                break;
            case 'C':
                myCheckArr[1]++;
                if (myCheckArr[1] == checkArr[1]) {
                    checkSecret++;
                }
                break;
            case 'G':
                myCheckArr[2]++;
                if (myCheckArr[2] == checkArr[2]) {
                    checkSecret++;
                }
                break;
            case 'T':
                myCheckArr[3]++;
                if (myCheckArr[3] == checkArr[3]) {
                    checkSecret++;
                }
                break;
        }
    }
}