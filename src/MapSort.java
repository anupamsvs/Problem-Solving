import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSort {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        map.put("nine",10);

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::print);

        System.out.println();
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::print);

        System.out.println();

//        map.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                ))

        System.out.println(map);
    }

}
