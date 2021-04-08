import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElements {

    public static void main(String[] args) {

        List<Integer> arr1 = Arrays.asList(2, 5, 2, 8, 1,10,3);
        List<Integer> arr2 = Arrays.asList(7, 9, 5, 2, 4, 10, 10);
        List<Integer> arr3 = Arrays.asList(6, 7, 5, 5, 3, 7);

        Set<Integer> result = new HashSet<>();

        System.out.println(commonElements(arr1, arr2, result));
        System.out.println(commonElements(arr2, arr3, result));
        System.out.println(commonElements(arr1, arr3, result));
    }

    private static Set<Integer> commonElements(List<Integer> arr1, List<Integer> arr2, Set<Integer> result) {
        for (Integer i : arr1) {
            if(arr2.stream().anyMatch(a -> a == i)){
                result.add(i);
            }
        }
        return result;
    }
}
