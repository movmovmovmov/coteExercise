import java.util.*;
public class Main {
    public static void main(String[] args) {

            List<String> list = inputScanner();
            int input = Integer.parseInt(list.get(0));
            
            int repeat = input/4;
            
            for (int i = 0; i < repeat; i++){
                System.out.print("long ");
            }
            System.out.print("int");
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