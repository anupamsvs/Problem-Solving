public class EY {
    public static void main(String[] args) {
        String str = "Anupam";
        char[] chaa = str.toCharArray();
        int len = chaa.length;
        char[] ch = new char[len-1];

        String rev = "";
        for(int i = len -1 ; i>=0; i--){


            ch[len - i +1] = chaa[i];
            //rev= rev + chaa[i];

        }

        System.out.println(rev);
    }
}
