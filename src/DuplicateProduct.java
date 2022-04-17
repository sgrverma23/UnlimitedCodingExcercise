import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateProduct {

    String name;
    int price;
    int weight;
    public DuplicateProduct(String name, int price, int weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("ball");names.add("box");
        names.add("ball");
        names.add("ball");names.add("box");

        List<Integer> price = new ArrayList<>();
        price.add(2);price.add(2);price.add(2);price.add(2);price.add(2);
        List<Integer> weight = new ArrayList<>();
        weight.add(1); weight.add(2); weight.add(1); weight.add(1); weight.add(3);
        System.out.println(numDuplicates(names, price, weight));
    }

    public static int numDuplicates(List<String> names, List<Integer> price,
                                    List<Integer> weight) {
        int count = 0;
        String product = "";
        Map<String, Integer> dupMap = new HashMap<String, Integer>();
        for (int i = 0; i < names.size(); i++) {
            product = names.get(i) + price.get(i) + weight.get(i);
            if (dupMap.get(product) != null) {
                count++;
            } else {
                dupMap.put(product, 1);
            }

        }

        return count;
    }

}
