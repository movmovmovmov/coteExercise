class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        // 원본 문자열
        int strlength = my_string.length();
        char[] charArray = my_string.toCharArray();
        
        // 붙여넣을 문자열 길이
        int overStrlength = overwrite_string.length();
        char[] overCharArray = overwrite_string.toCharArray();
        // 오버라이딩 인덱스
        int j = 0;
        
        for (int i = 0; i < strlength; i++) {
            // 지정 인덱스보다 작을 때, 원본 글자 넣기
	        if(i < s ){
                answer += charArray[i];
            }
            // 붙여넣을 문자 넣기
            if(i >= s && j < overStrlength){
                answer += overCharArray[j];
                j++;
                
            } else if(i > s) {
            answer += charArray[i];    
            }
            
        }
        

        
        return answer;
    }
}