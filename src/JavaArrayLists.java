import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ArrayList<Integer>> mainList = new ArrayList();
        int noOfLines = sc.nextInt();
        for(int i=0;i<noOfLines;i++) {
            int m = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < m; j++) {
                list.add(sc.nextInt());
            }
            mainList.add((ArrayList<Integer>) list);
        }
        int n = sc.nextInt();
        for(int k=0;k<n;k++){
            int y = sc.nextInt();
            int x = sc.nextInt();
            try {
                int v = mainList.get(y - 1).get(x - 1);
                System.out.println(v);
            }
            catch (Exception e){
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
