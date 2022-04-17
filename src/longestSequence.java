import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class longestSequence {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 5, 12, 6, 8};
        longestSeq(arr);
    }
    public static void longestSeq(int[] arr){
        Set<Integer> seqSet = IntStream.of(arr).boxed().collect(Collectors.toSet());
        int longSeq = 1;
        for(int i : seqSet){
            if(!seqSet.contains(i-1)){
                int currSeq = 1;
                while(seqSet.contains(i+currSeq)){
                    currSeq++;
                }
                longSeq = Math.max(longSeq, currSeq);
            }
        }
        System.out.println(longSeq);
    }
}
