import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCheckDemo{

    public static void main(String... args){

        String str = "thisismoradabad";

        checkFrequency(str);

        GenericsTest gn = new GenericsTest("abc",1);
    }


    private static void checkFrequency(String str){

        Map<Character, Integer> charMapCount = new HashMap<>();
        char[] arr = str.toCharArray();

        int val = 0;

        for(int i = 0; i < arr.length; i++){

            if(charMapCount.containsKey(arr[i])){

                val = charMapCount.get(arr[i]);
                charMapCount.put(arr[i], ++val);

            }

            else{

                charMapCount.put(arr[i], 1);

            }

        }

        printFrequency(charMapCount);

    }


    private static void printFrequency(Map<Character,Integer> printMap) {

        for (Map.Entry entry : printMap.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
    }