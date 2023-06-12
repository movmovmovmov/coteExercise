class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        int arrLength = arr.length;
        
        for(int i = 0; i < arrLength; i++){
            answer += arr[i];
        }
        
        return answer;
    }
}