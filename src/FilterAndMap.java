import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FilterAndMap {
    List<Integer> inputList1 = Arrays.asList(2,5,6,7,23,56);
    public static void main(String... args){

        List<Integer> inputList = Arrays.asList(2,5,6,7,23,56);

        getEvenTimesFour(inputList);
    }

    private static void getEvenTimesFour(List<Integer> inputList) {
        inputList.stream().filter(a -> a % 2 == 0).map(a -> a*4).forEach(System.out::println);
        //inputList.stream().filter(a -> a % 2 == 0).forEach(System.out::println);
    }

    List l = new ArrayList(inputList1);
Set ahhs = new HashSet(inputList1);


}
