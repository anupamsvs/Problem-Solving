import java.util.HashMap;
import java.util.Map;

public class MapAddressCheck {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();

        map1.put("a","1");
        map1.put("b","2");

        Map<String,String> map2 = new HashMap<>(map1);

        map2.remove("b");
        System.out.println(map1);
        System.out.println(map2);
    }
}
