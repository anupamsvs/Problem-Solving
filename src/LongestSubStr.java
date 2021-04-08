import java.util.HashMap;
import java.util.Map;

public class LongestSubStr {
    public static void main(String[] args) {
        String str = "shashi";
        System.out.println(getLongestSubStr(str));
    }

    private static int getLongestSubStr(String s) {
        int tempLen = 0;
        int count = 0;
        Map<Character, Integer> strMap = new HashMap<>();
        char[] charArr = s.toCharArray();

        for (int j = 0; j < charArr.length; j++) {
            if (charArr.length - j > count) {
                for (int i = j; i < charArr.length; i++) {
                    if (!strMap.containsKey(charArr[i])) {
                        strMap.put(charArr[i], i);
                        tempLen++;
                    } else {
                        strMap.clear();
                        i = charArr.length - 1;
                    }
                }
                if (count < tempLen) {
                    count = tempLen;
                }
                tempLen = 0;
            }
        }
        return count;
    }
}
