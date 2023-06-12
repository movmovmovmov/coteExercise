class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int strLength = str1.length();
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        
        for(int i = 0; i < strLength; i++) {
            answer += char1[i];
            answer += char2[i];
        }
        
        return answer;
    }
}