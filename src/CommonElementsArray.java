import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsArray {
    public static void main(String[] args) {
        List<Integer> l1 =  new ArrayList<Integer>();
        Arrays.asList(2,3);
        l1.add(2);
        l1.add(7);
        l1.add(4);
        l1.add(1);
        l1.add(10);
        l1.add(5);
        l1.add(8);
        List<Integer> l2 =  new ArrayList<Integer>();
        l2.add(5);
        l2.add(8);
        l2.add(4);
        l2.add(7);

        System.out.println(commonElementUnsortedArray(l1, l2));
    }

    private static List<Integer> commonElementUnsortedArray(List<Integer> l1, List<Integer> l2) {

        Set<Integer> s1 = new HashSet<>(l1);
        Set<Integer> s2 = new HashSet<>(l2);
        List<Integer> commonList = new ArrayList<>();

        for(Integer i : s1){
            if(s2.stream().anyMatch(n -> n==i)){
                commonList.add(i);
            }
        }
        return commonList;
    }
}
