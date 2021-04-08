public class PalindromicInteger {

    public static void main(String... args){
        System.out.println(isPalindrome(123321));
    }

    public static boolean isPalindrome(int x) {
        int j = 0, k = x;
        if( x == 0){
            return true;
        }
        if(x < 0){
            return false;
        }

        while(x > 0){
            j = x % 10 + j * 10;
            x = x / 10;
        }

        if( j == k){
            return true;
        }
        return false;
    }
}
