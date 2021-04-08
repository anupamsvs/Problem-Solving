import java.util.HashMap;
import java.util.Map;

public class LC_TwoSum {
    public static void  main(String[] args){
        int target = 13;
        int[] arr = {2,4,5,7,9};
        int[] twoSum = twoSum(arr, target);
        System.out.println(twoSum[0] +" " + twoSum[1]);

    }
    public static int[] twoSum(int[] num, int target){
        Map<Integer,Integer> hashmap = new HashMap<>();

        for(int i = 0 ; i < num.length; i++){
            int delta = target - num[i];

            if(hashmap.containsKey(delta)){
                return new int[] {i ,hashmap.get(delta)};
            }
                hashmap.put(num[i], i);
        }
        return new int[] {-1, -1};

    }
}
