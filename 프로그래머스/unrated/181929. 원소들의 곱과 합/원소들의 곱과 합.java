class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int sub = 1;
        
        for(int i = 0; i < num_list.length; i++){
            sub *= num_list[i];
            sum += num_list[i];
        }
        sum = (int)Math.pow(sum,2);
        
        if (sub < sum) { 
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}