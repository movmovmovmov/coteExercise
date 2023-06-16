class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean even;
        // 짝수
        if(n % 2 == 0 ){
            even = true;
            
        // 홀수    
        } else {
            even = false;
        }

            if(even){
                for(int i = 1; i < n+1; i++){
                    if(i % 2 == 0){
                    answer +=  (int) Math.pow(i , 2);    
                    }
                }
                
            } else {
                for(int i = 1; i < n+1; i++){
                    if(i % 2 == 1){
                    answer +=  i;    
                    }
                }
            }
        
        
        return answer;
    }
}