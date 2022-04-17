import java.util.*;

public class DayOfWeek {
    public static void main(String[] args) {
        List<String> week = Arrays.asList("SUN", "MON", "TUES","WED","THRUS","FRI","SAT");
        Map<String, Integer> map = new HashMap<>();
        map.put("SUN",0);
        map.put("MON",1);
        map.put("TUES",2);
        map.put("WED",3);
        map.put("THRUS",4);
        map.put("FRI",5);
        map.put("SAT",6);
        System.out.println(week.get((map.get("WED")+14)%7));

    }
}
