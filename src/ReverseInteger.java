public class ReverseInteger {
    public static void main(String[] args) {
        reverse(12345);
    }

    public static void reverse(int x) {
        int j =0 , prev = 0;

        while(x > 0 || x < 0){

            j = x % 10 + j * 10;
            if( (j - (x % 10)) / 10 != prev){
                //return 0;
            }
            prev = j ;
            x = x / 10;
        }
        System.out.println(j);
    }
}


