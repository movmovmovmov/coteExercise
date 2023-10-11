import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            ArrayList<Integer> list = new ArrayList<>();
            
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            list.sort(Comparator.reverseOrder());
            
            int matchCnt;
            int noon;
            int result = 0;
            
            ArrayList<Integer> matchList = new ArrayList<>();
            
            for(int i=0; i<list.size(); i++){
                matchList.add(Collections.frequency(list, list.get(i)));
            }
            
            if(Collections.max(matchList) == 1) {
                noon = list.get(0);
            } else { noon = list.get(matchList.indexOf(Collections.max(matchList))); }
            
            
            switch(Collections.max(matchList)){
            case 1: result = noon*100;
                break;
            case 2: result = noon*100+1000;
                break;
            case 3: result = noon*1000+10000;
                break;
            }
            
            System.out.println(result);
        }
    }
}