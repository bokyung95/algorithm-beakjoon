import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int size = 0;
        Queue<String> queue = new LinkedList<>();

        if (cacheSize == 0) {
            return cities.length * 5;
        } else {
            for (String city : cities) {
                String checkCity = city.toLowerCase();

                if (queue.contains(checkCity)) {
                    if (size == cacheSize) {
                        queue.remove(checkCity);
                        queue.add(checkCity);
                        answer += 1;
                    } else if (size < cacheSize) {
                        queue.add(checkCity);
                        answer += 1;
                        size++;
                    }
                } else {
                    if (size == cacheSize) {
                        queue.poll();
                        queue.add(checkCity);
                        answer += 5;
                    } else if (size < cacheSize) {
                        queue.add(checkCity);
                        answer += 5;
                        size++;
                    }
                }
            }
        }

        return answer;
    }
}