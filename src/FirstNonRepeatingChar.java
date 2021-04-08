import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        Character[] arr = {'a','b','f','b','f','e','e','b','a','e','d'};
        System.out.println(firstNonRepeatingChar(arr));
    }
    private static char firstNonRepeatingChar(Character[] arr) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        int i = 0;
        int val = 0;
        while(i < arr.length){
         if(charMap.containsKey(arr[i])){
             val = (int) charMap.get(arr[i]);
             charMap.put(arr[i], ++val);
         }
         else{
             charMap.put(arr[i],1);
         }
         i++;
        }
        System.out.println(charMap);

        for(Map.Entry<Character,Integer> entry : charMap.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return '_';
    }
}
