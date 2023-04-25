import java.util.*;
public class Solution{ 

    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> Q = new LinkedList<>();
        List<Integer> answer = new ArrayList<>(); 
        
        for(int i=0; i<progresses.length; i++)
                Q.add((int) (Math.ceil((100.0-progresses[i])/speeds[i])));
        

            while(!Q.isEmpty()) {
                int N = Q.poll(); //비교할 값 생성하고
                int cnt = 1; //배포 수, poll 될 때 1


                //비교값이 큐 맨위 값보다 크다면 빼기 반복 N값은 늘어남
                while(!Q.isEmpty() && N >= Q.peek()) {
                    cnt++; //poll 한번 더 실행
                    Q.poll(); 
                   
                }

                answer.add(cnt);
            }

            return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}