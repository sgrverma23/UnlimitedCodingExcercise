import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfCoins {
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        List<Integer> pilesList = Arrays.stream(piles).boxed().collect(Collectors.toList());
        int start=0;
        int end=pilesList.size()-1;
        int sum = 0;
        while(start<end){
            sum += pilesList.get(end-1);
            pilesList.remove(start++);
            pilesList.remove(end--);
            pilesList.remove(end);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] piles = {2,4,1,2,7,8};
        System.out.println(maxCoins(piles));
    }
}
