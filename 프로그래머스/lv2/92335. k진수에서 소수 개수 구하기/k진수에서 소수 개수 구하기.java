import java.util.*;

class Solution {
    public int solution(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        
        String numK = "";
        while(n != 0){
            numK += String.valueOf(n % k);
            n = n / k;
        }
        numK = sb.append(numK).reverse().toString();
        
        
        System.out.println(numK);
        
        numK = numK.replaceAll("[0]{2,}","0");
        String[] num = numK.split("0");
        
        for(int i = 0; i < num.length;i ++){
                if(isPrime(Long.parseLong(num[i]))){
                    answer++;
                  }
            
             System.out.println(i + " " + num[i]);
            
        }
        return answer;
    }
    
    public boolean isPrime(Long n){
        if (n == 1 || n == 0){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}