import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCheck {
    public static void main(String... args){
        String str = "hellohyderabad";
        checkfrequency(str);
    }

    private static void checkfrequency(String str) {
        char[] ch = str.toCharArray();
        Map<Character,Integer> myMap = new HashMap<>();

        for(int i = 0; i< ch.length; i++){
            if(myMap.containsKey(ch[i])){
                myMap.put(ch[i], myMap.get(ch[i])+1);
            }
            else{
                myMap.put(ch[i], 1);
            }
        }
        printFrequency(myMap);
    }

    private static void printFrequency(Map<Character, Integer> myMap) {
        for(Map.Entry<Character, Integer> entry : myMap.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
