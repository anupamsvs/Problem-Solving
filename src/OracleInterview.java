import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OracleInterview {
    public static void main(String[] args) {
        int [] orders = new int[]{5,5,5,10,10};
        isChangeAvailable (orders);
    }

    private static Boolean isChangeAvailable(int[] orders) {
        int balance = 0;
        int count5 = 0;
        int count10 = 0;
        int count20 = 0;
        Map denomination = new HashMap<>();
        if( orders[0] != 5 ){
            return false;
        }
        for(int i = 0; i< orders.length; i++){

            if(orders[i]==5) {
                denomination.put(5, ++count5);
                balance = balance + 5;
            }
            if(orders[i]==10){
                if(balance < 5){
                    return false;
                }
                else if (count5 > 0){
                    count5 = count5 - 1;
                    denomination.put(5 , count5);
                }
                balance = balance + 5;
                denomination.put(10, ++count10);
            }
            if(orders[i] == 20){

                if(balance < 15){
                    return false;
                }
                if(count5 > 0 && count10 > 0 ){
                    count5 = count5 - 1;
                    count10 = count10 - 1;
                    denomination.put(5 , count5);
                    denomination.put(10 , count10);
                }
                if (count10 == 0 && count5 >= 3){
                    count5 = count5 - 3;
                    denomination.put(5, count5);
                }
                balance = balance + 15;
                denomination.put(orders[i], ++count20);
            }
        }
        return true;
    }
}
