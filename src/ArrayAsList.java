import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {


    public static void main(String[] args) {
//        List<String> l1 = Arrays.asList("one","two","three");
//        List l2 = new ArrayList(l1);
//        l2.add("four");
//
//        System.out.println(l2);

        String text  = null;
        File file = new File ("C:\\Users\\aajit001\\Desktop\\LTI docs\\OfferLetterTCS", "abs");
        try{
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


class TRSingleton {

    private TRSingleton ()
    {}

    private static TRSingleton trSingleton ;
    static int count = 0;
    public static TRSingleton getInstance(){
        if(trSingleton == null){
            trSingleton = new TRSingleton();
            System.out.println(count++);
        }
        return trSingleton;
    }

}



