class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = String.valueOf(a) + String.valueOf(b);
        String str2 = String.valueOf(b) + String.valueOf(a);
        int numA = Integer.parseInt(str1);
        int numB = Integer.parseInt(str2);
        
        if( numB > numA){
            answer += numB;
        } else {
            answer += numA;
        }
        return answer;
    }
}