import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class StringChain {

    public static void longestStrChain(String[] words) {
        int rst = 0;
        Arrays.sort(words, Comparator.comparing(a -> a.length()));
        HashMap<String, Integer> wordChainMap = new HashMap();
        for (String word : words) {
            if (wordChainMap.containsKey(word)) continue;
            wordChainMap.put(word, 1);
            for (int i = 0; i < word.length(); i++) {
                StringBuilder sb = new StringBuilder(word);
                sb.deleteCharAt(i);
                String lastWord = sb.toString();
                if (wordChainMap.containsKey(lastWord) && wordChainMap.get(lastWord) + 1 > wordChainMap.get(word)) {
                    wordChainMap.put(word, wordChainMap.get(lastWord) + 1);
                }
            }
            if (wordChainMap.get(word) > rst) rst = wordChainMap.get(word);
        }
        System.out.println(rst);
    }

    public static void main(String[] args) {
        String[] arr = {"a","b","ba","bca","bda","bdca"};
        longestStrChain(arr);
    }
}
