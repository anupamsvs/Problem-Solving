public class MaxPairSum {

    public static void main(String[] args) {

        int[] arr = {5,6,15,16,19,12,24,99};
        System.out.println(maxPairSum(arr));
    }

    private static int maxPairSum(int[] arr) {

        int max;
        int min;

        max = Math.max(2, 5);
        min = Math.min(2, 5);
        int i = 2;

        while(i < arr.length){

            if(arr[i] > min && arr[i] > max){
                min = max;
                max = arr[i];
            }
            if(arr[i] > min && arr[i] < max){
                min = arr[i];
            }
            i++;
        }
        return (min + max);
    }
}
