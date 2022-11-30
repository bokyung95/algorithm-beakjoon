class Solution {
    static int answer = 0;
    
    public int solution(int n, int k) {
        String number = Integer.toString(n, k); //10진수 n k진수로 변환하기
        String[] numArr = number.split("0");
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i].length() != 0 && Long.parseLong(numArr[i]) != 1) {
                isPrime(Long.parseLong(numArr[i]));
            }
        }
        return answer;
    }
    
    public static void isPrime(long n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return;
            }
        }
        answer++;
    }
}