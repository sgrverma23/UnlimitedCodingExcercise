import java.util.Scanner;

public class LexicographicalOrder {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String result = findSmallAndLarge(s,k);
        System.out.println(result);
    }

    private static String findSmallAndLarge(String s, int k) {
        String currStr = s.substring(0,k);
        System.out.println("currStr "+ currStr);
        String min = currStr;
        String max = currStr;

        for(int i=k;i<s.length();i++){
            currStr = currStr.substring(1,k)+s.charAt(i);
            System.out.println("str "+ currStr);
            if(min.compareTo(currStr)>0)
                min=currStr;
            if(max.compareTo(currStr)<0)
                max=currStr;
        }

        return min+"\n"+max;
    }
}
