import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String... args){
        List<Integer> testList = new ArrayList<>();
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        testList.add(6);
        testList.add(6);

        //testList.stream().forEach(System.out::print);

        System.out.println("my test list ------"+testList);

        System.out.println("-----");
        Set<Integer> testSet = new HashSet<>();
        testSet.add(2);
        testSet.add(3);
        testSet.add(4);
        testSet.stream().forEach(System.out::print);

        System.out.println("-----");
        Set<Integer> testSet1 = new HashSet<>(testList);
        testSet1.stream().forEach(System.out::print);
        System.out.println("-----");

        Map<String,String> testMap = new HashMap<>();

        //System.out.println(9/2);
        System.out.println(tryCatchTest());

    }
    public static int tryCatchTest() {
        try {
            //return 1;
            System.out.println("Hello in try");
        }
        catch (Exception e){
            return 2;
            //System.out.println("Hello in catch");
            //e.printStackTrace();
        }
        finally {
            return 3;
            //System.out.println("Hello in finally");
        }
    }
}
