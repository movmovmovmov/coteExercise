import java.util.Scanner;
import java.lang.Character;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        
        for (int i = 0; i < str.length(); i++){
            
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                String tmp = Character.toString(ch);
                answer += tmp.toUpperCase();
            } else { 
                String tmp = Character.toString(ch);
                answer += tmp.toLowerCase();
            }
        }
        System.out.println(answer);
    }
}