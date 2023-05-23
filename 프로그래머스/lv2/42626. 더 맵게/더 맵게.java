import java.util.Collections;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // 우선순위 큐 선언
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        // 배열 -> 우선순위 큐
        for(int i=0; i < scoville.length; i++){
            
            queue.add(scoville[i]);

        }
        
        
        // 포인트 체크 후 K보다 작으면 실행
        while( queue.peek() < K ){
            // K 이상으로 못만드는 경우 추가 이거 때문에 런타임 에러...(눈물)
            if(queue.size() == 1){
                answer = -1;
                break;
            }
            
            int first = queue.poll();
            int second = queue.poll();
            
            int newScore = first + second * 2;
            queue.add(newScore);
            answer++;
        
        }
    
          return answer;
    }
}