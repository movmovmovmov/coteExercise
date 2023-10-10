import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            int time = sc.nextInt();
            
            minute += time;
            
            if(minute == 60) {
                hour += 1;
                minute = 0;
            } else if(minute > 60) {
                hour += minute / 60;
                minute = minute % 60;
            }
            
            
            if(hour > 23){
                hour -= 24;
            }
            
            System.out.println(hour+" "+minute);
        }
    }
}