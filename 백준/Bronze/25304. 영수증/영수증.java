import java.util.*;
public class Main {
    public static void main(String[] args) {

            List<String> list = inputScanner();
            int total = Integer.parseInt(list.get(0));
            int cnt = Integer.parseInt(list.get(1));
            
            int sum = 0;
            
            for (int i = 0; i < list.size(); i++){
                if (i != 0 && i != 1){
                String line = list.get(i);
                   String[] arr = line.split(" ");     
                    sum += Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
                }
            }
            
            if(list.size()-2 == cnt && total == sum){
                System.out.println("Yes");
            } else {
                System.out.println("No");
                
            }
        }
    
    
    public static List<String> inputScanner() {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        while (sc.hasNext()) {
            list.add(sc.nextLine());
        }
        return list;
    }
}